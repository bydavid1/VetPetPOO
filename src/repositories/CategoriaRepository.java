package repositories;

import interfaces.IRepository;
import models.Categoria;

import java.util.Collections;
import java.util.List;

public class CategoriaRepository implements IRepository {

    private List<Categoria> categorias;

    @Override
    public List<Object> get() {
        return Collections.singletonList(categorias);
    }

    @Override
    public void create(Object object) {
        categorias.add((Categoria) object);
    }

    @Override
    public void update(Object object, int id) {
        categorias.set(id, (Categoria) object);
    }

    @Override
    public void delete(int id) {
        categorias.remove(id);
    }
}
