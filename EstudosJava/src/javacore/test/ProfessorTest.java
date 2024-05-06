package javacore.test;

import javacore.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "maria";
        professor.cpf = "10230403122";
        professor.matricula = "12123";
        professor.rg = "1234567";

                System.out.println(professor.nome);
        System.out.println(professor.cpf);
        System.out.println(professor.matricula);
        System.out.println(professor.rg);

        System.out.println("---------------------");
        Professor professor1 = new Professor();
        professor1.nome = "pedro";
        professor1.matricula = "1122223";
        professor1.cpf = "10101010100";
        professor1.rg = "81111";

        System.out.println(professor1.nome);
        System.out.println(professor1.matricula);
        System.out.println(professor1.cpf);
        System.out.println(professor1.rg);


    }

}
