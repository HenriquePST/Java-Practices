package Poo.src.br.tw.classes;

import Poo.src.br.tw.interfaces.Isaldo;

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

    }

