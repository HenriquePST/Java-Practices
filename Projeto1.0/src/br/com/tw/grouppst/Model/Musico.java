package br.com.tw.grouppst.Model;

public class  Musico extends Pessoa {

    public Musico(){}

    public Musico(Long id, String nome, String telefone, String cpf, String endereco) {
        super(id, nome, telefone, cpf, endereco);
    }
    public Musico( String nome, String telefone, String cpf, String endereco) {
        super(null, nome, telefone, cpf, endereco);
    }
}
