package Poo.src.br.tw;

import Poo.src.br.tw.classes.Atendimento;
import Poo.src.br.tw.classes.Cliente;
import Poo.src.br.tw.classes.Musico;


public class App {

    public static void main(String[] args) {
        var musico = new Musico("Joao Candido", "81 9999999", "av. recife", "123");

        System.out.println("nome" + musico.getnome());
        System.out.println("telefone" + musico.getTelefone());
        System.out.println("endereco" + musico.getEndereco());
        System.out.println("ChavePix" + musico.getChavePix());
        System.out.println("saldo:" + musico.getSaldo());
        musico.depositar(100);
        System.out.println("saldo:" + musico.getSaldo());
        musico.sacar(50);
        System.out.println("saldo" + musico.getSaldo());
        musico.atender("Joao");

        var cliente = new Cliente("Pedro", "81 9999999", "av caxanga");

        System.out.println("nome" + cliente.getnome());
        System.out.println("telefone" + cliente.getTelefone());
        System.out.println("endereco" + cliente.getEndereco());
        System.out.println("Saldo" + cliente.getSaldo());
        cliente.depositar(100);
        System.out.println("Saldo" + cliente.getSaldo());
        cliente.sacar(50);
        System.out.println("Saldo" + cliente.getSaldo());
                var atendimento = new Atendimento();
        atendimento.setHoras(6);
        System.out.println(atendimento.getHoras());

    }
}


