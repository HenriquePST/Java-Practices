package br.com.tw.grouppst;

import br.com.tw.grouppst.Model.Musico;

public class Main {
    public static void main(String[] args) {
        var musico = new Musico(1L,"Joao","81999999", "10210310422","av.caxanga");

        System.out.println(musico.getId());
        System.out.println(musico.getNome());
        System.out.println(musico.getTelefone());
        System.out.println(musico.getCpf());
        System.out.println(musico.getEndereco());
    }
}