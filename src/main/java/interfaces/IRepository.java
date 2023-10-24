package interfaces;

import java.util.List;

public interface IRepository {
    List<Object> get();
    Object getById(int id);
    void create(Object object);
    void update(Object object, int id);
    void delete(int id);
}
