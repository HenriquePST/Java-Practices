package Poo.src.br.tw.JavaPratices;


import Poo.src.br.tw.JavaPratices.classes.Diarista;

public class App {
    public static void main(String[] args) {
        var joao = new Diarista();
        joao.nome = "Joao Candido";
        joao.telefone = "81 9999999";
        joao.endereco = "av. recife";

        System.out.println("nome" + joao.nome);
        System.out.println("telefone" + joao.telefone);
        System.out.println("endereco" + joao.endereco);

        var Maria = new Diarista();
        Maria.nome = "Maria da Silva";
        Maria.telefone = "81 99999";
        Maria.endereco = "av.recife";

        System.out.println("nome" + Maria.nome);
        System.out.println("telefone" + Maria.telefone);
        System.out.println("endereco" + Maria.endereco);
    }
}
