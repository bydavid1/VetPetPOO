package repositories;

import interfaces.IRepository;
import models.Paciente;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PacienteRepository implements IRepository<Paciente> {

    private final String directoryPath = "data/pacientes/";

    public PacienteRepository() {
        createDirectoryIfNotExists();
    }

    private void createDirectoryIfNotExists() {
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            directory.mkdirs(); // Crea el directorio si no existe
        }
    }

    @Override
    public List<Paciente> get() {
        List<Paciente> pacientes = new ArrayList<>();
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
                    Paciente paciente = (Paciente) inputStream.readObject();
                    pacientes.add(paciente);
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
        return pacientes;
    }

    @Override
    public Paciente getById(int id) {
        File file = new File(directoryPath + "paciente_" + id + ".txt");
        if (file.exists()) {
            try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
                return (Paciente) inputStream.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public void create(Paciente object) {
        int newId = get().size(); // Obtener el tamaño actual para generar el próximo ID
        String filePath = directoryPath + "paciente_" + newId + ".txt";

        // check if file exists, if exist add 1 to newId
        while (new File(filePath).exists()) {
            newId++;
            filePath = directoryPath + "paciente_" + newId + ".txt";
        }

        object.setId(newId);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            outputStream.writeObject(object);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Object object, int id) {
        String filePath = directoryPath + "paciente_" + id + ".txt";
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
        String filePath = directoryPath + "paciente_" + id + ".txt";
        File file = new File(filePath);
        if (file.exists()) {
            file.delete();
        }
    }
}
