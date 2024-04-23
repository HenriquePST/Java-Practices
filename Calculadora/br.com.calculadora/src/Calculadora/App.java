package Calculadora;

import java.util.Scanner;

public class App {

    /**
     * declaracao de variavies global
     */
   static int soma,subtracao;
   static int x,y;


    public static void main(String[] args) {


        int x,y;
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o valor de x:");
        calculadora.x = scanner.nextInt();
        System.out.println("digite o valor de y:");
        calculadora.y = scanner.nextInt();


        calculadora.soma();
        calculadora.subtracao();
        calculadora.divisao();
        calculadora.Multiplicacao();
    }

}
