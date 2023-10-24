package repositories;

import interfaces.IRepository;
import models.Paciente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PacienteRepository implements IRepository {

    private List<Paciente> pacientes = new ArrayList<>();

    @Override
    public List<Object> get() {
        return new ArrayList<>(pacientes);
    }

    @Override
    public Object getById(int id) {
        return pacientes.get(id);
    }

    @Override
    public void create(Object object) {
        pacientes.add((Paciente) object);
    }

    @Override
    public void update(Object object, int id) {
        pacientes.set(id, (Paciente) object);
    }

    @Override
    public void delete(int id) {
        pacientes.remove(id);
    }
}
