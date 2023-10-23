package interfaces;

import java.util.List;

public interface IRepository {
    List<Object> get();
    void create(Object object);
    void update(Object object, int id);
    void delete(int id);
}