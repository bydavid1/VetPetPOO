package repositories;

import interfaces.IRepository;
import models.Expediente;

import java.util.ArrayList;
import java.util.List;

public class ExpedienteRepository implements IRepository {

    private List<Expediente> expedientes = new ArrayList<>();

    @Override
    public List<Object> get() {
        return new ArrayList<>(expedientes);
    }

    @Override
    public Object getById(int id) {
        return expedientes.get(id);
    }

    @Override
    public void create(Object object) {
        expedientes.add((Expediente) object);
    }

    @Override
    public void update(Object object, int id) {
        expedientes.set(id, (Expediente) object);
    }

    @Override
    public void delete(int id) {
        expedientes.remove(id);
    }
}
