package br.ListadeTarefas;

import java.util.Scanner;

public class ListadeTarefas {
    public static void main(String[] args) {

        Scanner scanner = new scanner(System.in);
        System.out.println("==== cadastro de usuario===");
        System.out.println("Digite o email");
        String email = scanner.nextLine();
        System.out.println("Digite a senha");
        String senha = scanner.nextLine();

        Usuario u = new Usuario();

        u.atribuiEmail(email);

        u.atribuiSenha(senha);

        System.out.println("o email cadastrado foi :" + u.email);


    }
}