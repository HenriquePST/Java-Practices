package Poo.src.br.tw.JavaPratices;


import Poo.src.br.tw.JavaPratices.classes.Diarista;

public class App {
    public static void main(String[] args) {
        var joao = new Diarista("Joao Candido","81 9999999","av. recife");
      
        System.out.println("nome" + joao.nome);
        System.out.println("telefone" + joao.telefone);
        System.out.println("endereco" + joao.endereco);

        joao.atender("Joao");

        var Maria = new Diarista("Maria da Silva","81 99999","av.recife");
       
        System.out.println("nome" + Maria.nome);
        System.out.println("telefone" + Maria.telefone);
        System.out.println("endereco" + Maria.endereco);

        Maria.atender("maria");

        var Luiz = new Diarista("Luiz");
        System.out.println("nome" + Luiz.nome);
    }
}
