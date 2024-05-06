package Introducao;

public class EstruturaCondicionais {
    public static void main(String[] args) {
        // if else
        var idade = 19;
        if (idade >= 18) {
            System.out.println("voce é maior de idade");
        } else if (idade >= 16) {
            System.out.println("voce é menor de idade, mas ja pode votar");
        } else {
            System.out.println("voce é menor de idade ");
        }

        // switch 
        
        var mesDoAno = 1;

        switch (mesDoAno) {
            case 1:
                System.out.println("janeiro");
                break;
            case 2:
                System.out.println("fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            default:
                System.out.println("Mes invalido");
                break;
        }
    
        // switch 

        var mesDoAno1 = 2;
        switch(mesDoAno1){
            case 1 -> System.out.println("janeiro");
            case 2 -> System.out.println("fevereiro");
            case 3 -> System.out.println("Março");
        }
    }
   
}

