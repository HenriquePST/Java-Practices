package br.com.calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * Declaração de variáveis locais (main)
         */
        Scanner scanner = new Scanner(System.in);

        //Instanciação de objetos
        Calculadora calc = new Calculadora();
        Calculadora calc2 = new Calculadora();

        /**
         * Entrada de Dados
         */

        System.out.println("digite o valor de x:");
        calc.x = scanner.nextInt();
        System.out.println("digite o valor de y:");
        calc.y = scanner.nextInt();

        System.out.println("digite o valor de x para calc2");
        calc2 x = scanner.nextInt();
        System.out.println("digite o valor de y para calc2");
        calc2.y = scanner.nextInt();

        calc.soma();
        calc.subtracao();
        calc.Multiplicacao();
        calc.divisao();

        System.out.println("-");
        System.out.println("====CAL2=====");
        calc2.soma();
        calc2.subtracao();
        calc2.Multiplicacao();
        calc2.divisao();

    }
}