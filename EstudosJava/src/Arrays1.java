public class Arrays1 {
    public static void main(String[] args) {

        //byte, short, int, long, float, double = 0
        // char '\u0000' ' '
        //boolean false;
        // reference null
        String[] nomes = new String[4];

        nomes[0] = "Naruto";
        nomes[1] = "Goku";
        nomes[2] = "luidii";
        nomes[3] = "kurosaki";

        // propriedade que retorna tamanho ddo array
      //  System.out.println(nomes.length);

        for (int i = 0; i<nomes.length;i++){
        //for (int i = 0; i < 3; i++) {
            System.out.println(nomes[i]);
        }

            /**
            System.out.println("NOME" + nomes[0]);
            System.out.println("NOME" + nomes[1]);
            System.out.println("NOME" + nomes[2]);
            **/

    }
}