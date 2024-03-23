package br.com.tw.grouppst.repository;

import java.util.List;

public interface IRepository <T, ID> {
    // T , ID - tipo generico,
    // T classe de modelo, é o ID tipo de classe do moddelo

    List<T> buscarTodos();

    T cadastrar( T model);

    T buscarPorId(ID id );

    boolean excluirPorId(ID id);
}
