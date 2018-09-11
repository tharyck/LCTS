package com.br.lcts.util;

import java.util.List;

public interface CrudService<T> {
    T create(T t);

    List<T> getAll();

    T getById(Long id);

    T update(T t);

    void removeById(Long id);

    void removeAll();
}