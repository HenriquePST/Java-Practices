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
        cliente.depositar(120);
        System.out.println("Saldo" + cliente.getSaldo());
        cliente.sacar(50);
        System.out.println("Saldo" + cliente.getSaldo());


        var atendimento = new Atendimento();
        atendimento.setHoras(6);
        System.out.println(atendimento.getHoras());

        var cliente2 = new Cliente("Pedro", "81 9999999", "av caxanga");
        var musico2 = new Musico("Joao Candido", "81 9999999", "av. recife", "123");


        cliente2.depositar(100);
        cliente2.transferir(musico2,30);

        System.out.println(cliente2.getSaldo());
        System.out.println(musico2.getSaldo());

        musico2.transferir(cliente2,10);

        System.out.println(cliente2.getSaldo());
        System.out.println(musico2.getSaldo());

        System.out.println(cliente);
        System.out.println(musico);

        var musico3 = new Musico("Joao Candido", "81 9999999", "av. recife", "123");
        var musico4 = new Musico("Joao Candido", "81 9999999", "av. recife", "123");

        System.out.println(musico3.equals(musico4));

        var atendimento2= new Atendimento();
        atendimento2.setData("01/01/2022");
        atendimento2.setHoras(10);
        atendimento2.setCliente(cliente);
        atendimento2.setMusico(musico);

        System.out.println(atendimento2.getData());
        System.out.println(atendimento2.getHoras());
        System.out.println(atendimento2.getCliente().getnome());
        System.out.println(atendimento2.getCliente().getnome());
    }
}


