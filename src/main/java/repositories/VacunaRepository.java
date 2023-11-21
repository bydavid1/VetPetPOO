package repositories;

import Helpers.Identifiable;
import interfaces.IRepository;
import models.Vacuna;
import java.util.ArrayList;
import java.util.List;

public class VacunaRepository implements IRepository {

    private List<Vacuna> vacunas = new ArrayList<>();

    @Override
    public List<Object> get() {
        return new ArrayList<>(vacunas);
    }

    @Override
    public Object getById(int id) {
        return vacunas.get(id);
    }

    @Override
    public void create(Identifiable object) {
        vacunas.add((Vacuna) object);
    }

    @Override
    public void update(Object object, int id) {
        vacunas.set(id, (Vacuna) object);
    }

    @Override
    public void delete(int id) {
        vacunas.remove(id);
    }
}

