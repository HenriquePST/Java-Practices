package IntroducaoJava;

import java.util.ArrayList;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        // while e do-while
        var contador = 0;

        while (contador < 100) {
            System.out.println("numero" + contador);
            contador++;
        }

        do {
            System.out.println("numero" + contador);
            contador++;
        } while (contador <= 100);

        // for
        for (var i = 0; i <= 10; i++) {
            System.out.println("numero" + i);
     
        }
        ;
        //for
        var notas = new ArrayList<Double>();
        notas.add(10.0);
        notas.add(9.0);
        notas.add(8.0);
        notas.add(4.0);
        notas.add(5.0);

        for ( var index = 0; index < notas.size();index ++){
            System.out.println(notas.get(index));
         }
         // foreach 
         for (Double nota : notas){
            System.out.println(nota);
         } 

    }
}
