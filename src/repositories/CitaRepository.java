package repositories;

import interfaces.IRepository;
import models.Cita;

import java.util.ArrayList;
import java.util.List;

public class CitaRepository implements IRepository {

    private List<Cita> citas = new ArrayList<>();

    @Override
    public List<Object> get() {
        return new ArrayList<>(citas);
    }

    @Override
    public Object getById(int id) {
        return citas.get(id);
    }

    @Override
    public void create(Object object) {
        citas.add((Cita) object);
    }

    @Override
    public void update(Object object, int id) {
        citas.set(id, (Cita) object);
    }

    @Override
    public void delete(int id) {
        citas.remove(id);
    }
}
