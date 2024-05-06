package javacore.test;

import javacore.classes.Carro;

public class CarroTest {

    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.modelo = "Fusca";
        carro.placa = "QQQ123";
        carro.velocidadeMax = 120f;

        System.out.println(carro.modelo);
        System.out.println(carro.placa);
        System.out.println(carro.velocidadeMax);
    }
}
