package br.com.tw.grouppst.repository;

import br.com.tw.grouppst.Model.Musico;

import java.util.ArrayList;
import java.util.List;

public class MusicoRepository implements IRepository <Musico, Long> {

    private List<Musico> musicos;
    private Long idAtual;


    public MusicoRepository(){
        musicos = new ArrayList<>();
       // musicos.add(new Musico(1L,"teste","81 818181-8181","921.292.199-11","rua recife"));
         idAtual = 1L;
    }

    @Override
    public List <Musico>buscarTodos() {
        return musicos;
    }

    @Override
    public Musico cadastrar(Musico model) {
        model.setId(idAtual);
        musicos.add(model);
        idAtual++;
        return model;
    }

    @Override
    public Musico buscarPorId(Long id) {
        for (Musico musico : musicos) {
            if (musico.getId().equals(id)){
                return musico;
            }
        }
        return null;
    }

    @Override
    public boolean excluirPorId(Long id) {
        var musicoEncontrado = buscarPorId(id);

        if (musicoEncontrado != null){
            musicos.remove(musicoEncontrado);
            return true;
        }
        return false;
    }
}
