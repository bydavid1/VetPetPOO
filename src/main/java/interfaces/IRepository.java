package interfaces;

import models.Categoria;

import java.util.List;

public interface IRepository<T>  {
    List<T> get();
    Object getById(int id);
    void create(T object);
    void update(Object object, int id);
    void delete(int id);
}
