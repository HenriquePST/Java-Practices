package br.com.calculadora;

public class Calculadora {

    /**
     * Declaração de variáveis de classe
     */

    static int x, y;
    static int soma, multiplicacao, divisao, subtracao;

    public static void soma() {

        soma = x + y;
        System.out.println(soma);
    }

    public static int soma(int x, int y){
        soma = x + y;
        System.out.println(soma);
        return soma;
    }

    public static void subtracao() {
        subtracao = x - y;
        System.out.println(subtracao);
    }

    public static void Multiplicacao() {

        multiplicacao = x * y;
        System.out.println(multiplicacao);
    }

    public static void divisao() {
        divisao = x / y;
        System.out.println(divisao);

    }
}


