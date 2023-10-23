package repositories;

import interfaces.IRepository;
import models.Expediente;

import java.util.Collections;
import java.util.List;

public class ExpedienteRepository implements IRepository {
    private List<Expediente> expedientes;
    @Override
    public List<Object> get() {
        return Collections.singletonList(expedientes);
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
