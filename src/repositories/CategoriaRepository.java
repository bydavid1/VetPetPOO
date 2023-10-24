package repositories;

import interfaces.IRepository;
import models.Categoria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CategoriaRepository implements IRepository {

    private List<Categoria> categorias = new ArrayList<>();

    @Override
    public List<Object> get() {
        return new ArrayList<>(categorias);
    }

    @Override
    public Object getById(int id) {
        return categorias.get(id);
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
