package repositories;

import interfaces.IRepository;
import models.Expediente;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ExpedienteRepository implements IRepository<Expediente> {

    private final String directoryPath = "data/expedientes/";

    public ExpedienteRepository() {
        createDirectoryIfNotExists();
    }

    private void createDirectoryIfNotExists() {
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            directory.mkdirs(); // Crea el directorio si no existe
        }
    }

    @Override
    public List<Expediente> get() {
        List<Expediente> expedientes = new ArrayList<>();
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
                    Expediente expediente = (Expediente) inputStream.readObject();
                    expedientes.add(expediente);
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
        return expedientes;
    }

    @Override
    public Object getById(int id) {
        File file = new File(directoryPath + "expediente_" + id + ".txt");
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
    public void create(Expediente object) {
        int newId = get().size(); // Obtener el tamaño actual para generar el próximo ID
        String filePath = directoryPath + "expediente_" + newId + ".txt";

        object.setId(newId);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            outputStream.writeObject(object);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Object object, int id) {
        String filePath = directoryPath + "expediente_" + id + ".txt";
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
        String filePath = directoryPath + "expediente_" + id + ".txt";
        File file = new File(filePath);
        if (file.exists()) {
            file.delete();
        }
    }

    public List<Expediente> getExpedientesByPacienteId(int id) {
        List<Expediente> expedientes = new ArrayList<>();
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
                    Expediente expediente = (Expediente) inputStream.readObject();
                    if (expediente.getIdPaciente() == id) {
                        expedientes.add(expediente);
                    }
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
        return expedientes;
    }
}
