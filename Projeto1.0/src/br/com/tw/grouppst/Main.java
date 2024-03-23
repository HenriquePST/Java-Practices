package br.com.tw.grouppst;

import br.com.tw.grouppst.Model.Musico;
import br.com.tw.grouppst.repository.MusicoRepository;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // cria uma instancia da clase Scanner refenciando scanner
        var scanner = new Scanner(System.in);
        var repository = new MusicoRepository();


        var opcao = "S";
        do {
            exibirMenu();

            System.out.print("Informe a opção desejada: ");
            opcao = scanner.nextLine();

            System.out.println();

            switch (opcao){
                case "1" -> listarMusicos (repository);
                case "2" -> cadastrarMusico(scanner, repository);
                case "3" -> buscarMusico(scanner, repository);
                case "4" -> excluirMusico(scanner, repository);
                case "S" -> System.out.println("Saindo do Sistema");
                default -> System.out.println("opcão invalida");
            }

        } while (!opcao.equals("S"));

        scanner.close();
    }


    private static void excluirMusico(Scanner scanner, MusicoRepository repository) {
        System.out.println("id ");
        var id = scanner.nextLong();
        scanner.nextLine();

        var foiExcluido = repository.excluirPorId(id);

        if (foiExcluido){
            System.out.println("Musico Excluido");
        } else {
            System.out.println("Musico não encontrado");
        }
    }

    private static void buscarMusico(Scanner scanner, MusicoRepository repository) {
        System.out.println("Id: ");
        var id = scanner.nextLong();
        scanner.nextLine();

        var musico = repository.buscarPorId(id);

        // verificar se existe o musico no cadastro

        if (musico != null){
            System.out.println(musico.getId() + " - " + musico.getNome());
        } else {
            System.out.println("Musico não encontrado");
        }
    }

    private static void cadastrarMusico(Scanner scanner, MusicoRepository repository) {
        System.out.print("Nome: ");
        var nome = scanner.nextLine();
        System.out.print("Telefone: ");
        var telefone = scanner.nextLine();
        System.out.print("CPF: ");
        var cpf = scanner.nextLine();
        System.out.print("Endereço: ");
        var endereco = scanner.nextLine();

        var musico = new Musico(nome, telefone,cpf, endereco);
        repository.cadastrar(musico);
        System.out.println("Cadastro com Sucesso");
    }

    private static void listarMusicos(MusicoRepository repository) {
        var musicos = repository.buscarTodos();

        if (musicos.isEmpty()){
            System.out.println("não encontrado");
        }
        for ( Musico musico: musicos){
            System.out.println("ID: "+musico.getId());
            System.out.println("Nome :" +musico.getNome());
            System.out.println("Endereço: " + musico.getEndereco());
            System.out.println("CPF: " +musico.getCpf());
            System.out.println("Telefone: " +musico.getTelefone());

        }
    }

    public static void exibirMenu(){

        System.out.println("1 - Listar Musico");
        System.out.println("2 - Cadastrar Musico");
        System.out.println("3 - Buscar Musico");
        System.out.println("4 - Excluir Musico");
        System.out.println("T - Sair do Sistema");
    }
}