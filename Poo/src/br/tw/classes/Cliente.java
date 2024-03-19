package Poo.src.br.tw.classes;

public class Cliente extends Pessoa {


    public Cliente(String nome, String telefone, String endereco ) {
        super(nome, telefone, endereco);


    }
    @Override
    public void depositar (double valor){
        var saldoAtual = this.getSaldo();
        var novoSaldo = saldoAtual + valor + (valor + 0.1);
    }
    @Override
    public  void sacar (double valor){
        var saldoAtual = this.getSaldo();
        var novoSaldo = saldoAtual - valor;
        this.setSaldo(novoSaldo);
    }
}