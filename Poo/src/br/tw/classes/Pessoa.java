package Poo.src.br.tw.classes;

import Poo.src.br.tw.interfaces.Isaldo;

import java.util.Objects;

public abstract class Pessoa  implements Isaldo {

    private String nome;
    private String telefone;
    private String endereco;
    private double saldo;

    public Pessoa (String nome, String telefone, String endereco){
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.saldo = 0.0;
    }

    public String getnome (){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void transferir (Isaldo obj, double valor){
        this.sacar(valor);
        obj.depositar(valor);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Double.compare(saldo, pessoa.saldo) == 0 && Objects.equals(nome, pessoa.nome) && Objects.equals(telefone, pessoa.telefone) && Objects.equals(endereco, pessoa.endereco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, telefone, endereco, saldo);
    }
}

