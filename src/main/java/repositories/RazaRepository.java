package repositories;

import interfaces.IRepository;
import models.Raza;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RazaRepository implements IRepository {

    private final String directoryPath = "data/razas/";
    
    public RazaRepository() {
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
        List<Object> razas = new ArrayList<>();
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
                    Object raza = inputStream.readObject();
                    razas.add(raza);
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
        return razas;
    }

    @Override
    public Object getById(int id) {
        File file = new File(directoryPath + "raza_" + id + ".txt");
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
    public void create(Object object) {
        int newId = get().size();
        String filePath = directoryPath + "raza_" + newId + ".txt";
        System.out.println(filePath);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            outputStream.writeObject(object);
            System.out.println("Raza guardado exitosamente");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Object object, int id) {
        String filePath = directoryPath + "raza_" + id + ".txt";
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
        String filePath = directoryPath + "raza_" + id + ".txt";
        File file = new File(filePath);
        if (file.exists()) {
            file.delete();
        }
    }
}
