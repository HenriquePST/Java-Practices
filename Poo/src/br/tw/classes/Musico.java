package Poo.src.br.tw.classes;

import java.util.Objects;

public class Musico extends Pessoa{

    private String chavePix;

    public Musico(String nome){
        super(nome, null, null);
    }

    public Musico(String nome, String telefone, String endereco, String chavePix) {
        super(nome, telefone, endereco);
        this.chavePix = chavePix;

    }


    public void atender(String nomeCliente) {
        System.out.println("realizando atendimento para cliente" + nomeCliente);
    }
    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void sacar(double valor) {
        var saldoAtual = this.getSaldo();
        var novoSaldo = saldoAtual - valor;
        this.setSaldo(novoSaldo);
    }

    @Override
    public void depositar(double valor) {
        var saldoAtual = this.getSaldo();
        var novoSaldo =  saldoAtual + valor;
        this.setSaldo(novoSaldo);

    }
    @Override
    public String toString(){
        return "musico" +this.getnome();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Musico musico = (Musico) o;
        return Objects.equals(chavePix, musico.chavePix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), chavePix);
    }
}
