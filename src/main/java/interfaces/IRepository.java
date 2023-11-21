package interfaces;

import Helpers.Identifiable;

import java.util.List;

public interface IRepository {
    List<Object> get();
    Object getById(int id);
    void create(Identifiable object);
    void update(Object object, int id);
    void delete(int id);
}
