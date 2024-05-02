package br.com.tw.JavaPratices;

public class Variaveis {
    public static void main(String[] args) {
        String nome = "Teste";
        int idade = 20;
        float altura = 1.8f;
        double altura2 = 1.8;
        boolean Vivo = true;

        var variavel = "teste com var";

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(altura);
        System.out.println(altura2);
        System.out.println(Vivo);
        System.out.println(variavel);

        final var constante = "teste2 const";

        System.out.println(constante);

    }
    }

