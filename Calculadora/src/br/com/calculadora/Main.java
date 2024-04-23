package br.com.calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int x,y;
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o valor de x:");
        Calculadora.x = scanner.nextInt();
        System.out.println("digite o valor de y:");
        Calculadora.y = scanner.nextInt();


        Calculadora.soma();
        Calculadora.subtracao();
        Calculadora.Multiplicacao();
        Calculadora.divisao();

    }
}