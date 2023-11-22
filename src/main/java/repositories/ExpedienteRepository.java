package repositories;

import interfaces.IRepository;
import models.Expediente;

import java.util.ArrayList;
import java.util.List;

public class ExpedienteRepository implements IRepository<Expediente> {

    private List<Expediente> expedientes = new ArrayList<>();

    @Override
    public List<Expediente> get() {
        return new ArrayList<Expediente>(expedientes);
    }

    @Override
    public Object getById(int id) {
        return expedientes.get(id);
    }

    @Override
    public void create(Expediente object) {
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
