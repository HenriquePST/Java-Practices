package Poo.src.br.tw;

import Poo.src.br.tw.classes.Atendimento;
import Poo.src.br.tw.classes.Cliente;
import Poo.src.br.tw.classes.Musico;
import Poo.src.br.tw.classes.Pessoa;

public class App {

    public static void main(String[] args) {
        var musico = new Musico("Joao Candido", "81 9999999", "av. recife", "123");

        System.out.println("nome" + musico.getnome());
        System.out.println("telefone" + musico.getTelefone());
        System.out.println("endereco" + musico.getEndereco());
        System.out.println("ChavePix" + musico.getChavePix());

        musico.atender("Joao");

        var cliente = new Cliente("Pedro", "81 9999999", "av caxanga", 1000.0);

        System.out.println("nome" + cliente.getnome());
        System.out.println("telefone" + cliente.getTelefone());
        System.out.println("endereco" + cliente.getEndereco());
        System.out.println("endereco" + cliente.getSaldo());

        var atendimento = new Atendimento();
        atendimento.setHoras(6);
        System.out.println(atendimento.getHoras());

    }
}


