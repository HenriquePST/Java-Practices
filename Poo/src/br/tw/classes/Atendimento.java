package Poo.src.br.tw.classes;

public class Atendimento {

    private int horas;

    private Cliente cliente;

    private Musico musico;

    private  String data;

    public void setHoras(int horas) {
        if (horas < 1 || horas > 12) {
            System.out.println(" A quantiidade de hrs nao pode ser menor que 1 e nem maior que 12");
        }else{
            this.horas = horas;
        }
    }

    public int getHoras() {
        return horas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Musico getMusico() {
        return musico;
    }

    public void setMusico(Musico musico) {
        this.musico = musico;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
