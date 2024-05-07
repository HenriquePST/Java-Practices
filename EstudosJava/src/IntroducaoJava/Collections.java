package IntroducaoJava;

import java.util.ArrayList;
import java.util.HashMap;

public class Collections {

    public static void main(String[] args) {
        // List
        var notas = new ArrayList<Double>();

        notas.add(10.0);
        notas.add(8.4);
        notas.add(7.1);

        System.out.println(notas.get(0));
        System.out.println(notas.get(1));
        System.out.println(notas.get(2));

        System.out.println(notas.size());

        // Map
        var medias = new HashMap<String, Double>();

        medias.put("Joao", 10.0);
        medias.put("Pedro", 8.2);

        System.out.println(medias);
        System.out.println(medias.get("Joao"));

    }

}
