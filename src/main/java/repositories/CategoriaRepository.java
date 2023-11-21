package repositories;

import Helpers.Identifiable;
import interfaces.IRepository;
import models.Categoria;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CategoriaRepository implements IRepository {
    private final String directoryPath = "data/categorias/";

    public CategoriaRepository() {
        createDirectoryIfNotExists();
    }

    private void createDirectoryIfNotExists() {
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            directory.mkdirs(); // Crea el directorio si no existe
        }
    }

    @Override
    public List<Object> get() {
        List<Object> categorias = new ArrayList<>();
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
                    Object categoria = inputStream.readObject();
                    categorias.add(categoria);
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
        return categorias;
    }

    @Override
    public Object getById(int id) {
        File file = new File(directoryPath + "categoria_" + id + ".txt");
        if (file.exists()) {
            try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
                return inputStream.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public void create(Identifiable object) {
        int newId = get().size(); // Obtener el tamaño actual para generar el próximo ID
        String filePath = directoryPath + "categoria_" + newId + ".txt";

        object.setId(newId);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            outputStream.writeObject(object);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Object object, int id) {
        String filePath = directoryPath + "categoria_" + id + ".txt";
        if (new File(filePath).exists()) {
            try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
                outputStream.writeObject(object);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void delete(int id) {
        String filePath = directoryPath + "categoria_" + id + ".txt";
        File file = new File(filePath);
        if (file.exists()) {
            file.delete();
        }
    }
}
