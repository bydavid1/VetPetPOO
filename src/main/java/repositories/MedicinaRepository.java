package repositories;

import Helpers.Identifiable;
import interfaces.IRepository;
import models.Medicina;

import java.util.ArrayList;
import java.util.List;

public class MedicinaRepository implements IRepository {

    private List<Medicina> medicinas = new ArrayList<>();

    @Override
    public List<Object> get() {
        return new ArrayList<>(medicinas);
    }

    @Override
    public Object getById(int id) {
        return medicinas.get(id);
    }

    @Override
    public void create(Identifiable object) {
        medicinas.add((Medicina) object);
    }

    @Override
    public void update(Object object, int id) {
        medicinas.set(id, (Medicina) object);
    }

    @Override
    public void delete(int id) {
        medicinas.remove(id);
    }
}
