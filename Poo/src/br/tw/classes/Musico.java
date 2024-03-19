package Poo.src.br.tw.classes;

public class Musico extends Pessoa{

    private String chavePix;

    public Musico(String nome){
        super(nome, null, null);
    }

    public Musico(String nome, String telefone, String endereco, String chavePix) {
        super(nome, telefone, endereco);
        this.chavePix = chavePix;
    }


    public void atender(String nomeCliente) {
        System.out.println("realizando atendimento para cliente" + nomeCliente);
    }
    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }
}
