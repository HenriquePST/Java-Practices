package br.com.calculadora;

public class Calculadora {

    /**
     * Declaração de variáveis de classe
     */

    int x, y;
    int soma, multiplicacao, divisao, subtracao;

    public  void soma() {

        soma = x + y;
        System.out.println(soma);
    }

    public  int soma(int x, int y){
        soma = x + y;
        System.out.println(soma);
        return soma;
    }

    public void subtracao() {
        subtracao = x - y;
        System.out.println(subtracao);
    }

    public  void Multiplicacao() {

        multiplicacao = x * y;
        System.out.println(multiplicacao);
    }

    public  void divisao() {
        divisao = x / y;
        System.out.println(divisao);

    }
}


