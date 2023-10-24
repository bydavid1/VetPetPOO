package repositories;

import interfaces.IRepository;
import models.Raza;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RazaRepository implements IRepository {

    private List<Raza> razas = new ArrayList<>();

    @Override
    public List<Object> get() {
        return new ArrayList<>(razas);
    }

    @Override
    public Object getById(int id) {
        return razas.get(id);
    }

    @Override
    public void create(Object object) {
        razas.add((Raza) object);
    }

    @Override
    public void update(Object object, int id) {
        razas.set(id, (Raza) object);
    }

    @Override
    public void delete(int id) {
        razas.remove(id);
    }
}
