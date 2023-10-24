import models.*;
import repositories.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class MenuHandler {
    private Scanner scanner;
    private RazaRepository razaRepository;
    private CategoriaRepository categoriaRepository;
    private PacienteRepository pacienteRepository;
    private CitaRepository citaRepository;
    private ExpedienteRepository expedienteRepository;
    private VacunaRepository vacunaRepository;
    private MedicinaRepository medicinaRepository;

    public MenuHandler() {
        scanner = new Scanner(System.in);
        razaRepository = new RazaRepository();
        categoriaRepository = new CategoriaRepository();
        pacienteRepository = new PacienteRepository();
        citaRepository = new CitaRepository();
        expedienteRepository = new ExpedienteRepository();
        vacunaRepository = new VacunaRepository();
        medicinaRepository = new MedicinaRepository();
    }

    public void crearRaza() {
        System.out.print("Nombre de la raza: ");
        String nombreRaza = scanner.nextLine();
        Raza raza = new Raza(nombreRaza);
        razaRepository.create(raza);
    }

    public void crearCategoria() {
        System.out.print("Nombre de la categoria: ");
        String nombreCategoria = scanner.nextLine();
        Categoria categoria = new Categoria(nombreCategoria);
        // Guardar en el repositorio
        categoriaRepository.create(categoria);
    }

    public void crearPaciente() {
        // Nombre del paciente
        System.out.print("Nombre del paciente: ");
        String nombrePaciente = scanner.nextLine();

        // Raza del paciente
        System.out.print("Elige la raza: \n");
        List<Object> razas = razaRepository.get();
        for (int i = 0; i < razas.size(); i++) {
            System.out.println(i + ". " + ((Raza) razas.get(i)).getNombre());
        }
        String razaIndex = scanner.nextLine();
        Object razaObject = razas.get(Integer.parseInt(razaIndex));

        // Categoria del paciente
        System.out.print("Elije la categoria: \n");
        List<Object> categorias = categoriaRepository.get();
        for (int i = 0; i < categorias.size(); i++) {
            System.out.println(i + ". " + ((Categoria) categorias.get(i)).getNombre());
        }
        String categoriaIndex = scanner.nextLine();
        Object categoriaObject = categorias.get(Integer.parseInt(categoriaIndex));

        // Nombre del dueño
        System.out.print("Nombre del dueño: ");
        String nombreDueno = scanner.nextLine();

        // Edad del paciente
        System.out.print("Edad del paciente: ");
        int edad = scanner.nextInt();

        // Sexo del paciente
        System.out.print("Sexo del paciente: ");
        String sexo = scanner.nextLine();

        // Fecha de inscripcion, se obtiene la fecha actual
        Date fechaActual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String fechaActualString = formato.format(fechaActual);

        // Altura del paciente
        System.out.print("Altura del paciente: ");
        double altura = scanner.nextDouble();

        // Peso del paciente
        System.out.print("Peso del paciente: ");
        double peso = scanner.nextDouble();

        // ID unico del paciente
        System.out.print("ID unico del paciente: ");
        String idUnico = scanner.nextLine();

        // Pelaje del paciente
        System.out.print("Pelaje del paciente: ");
        String pelaje = scanner.nextLine();

        // Fecha de nacimiento del paciente
        System.out.print("Fecha de nacimiento del paciente: ");
        String fechaNacimiento = scanner.nextLine();

        // Crear el paciente
        Paciente paciente = new Paciente(nombrePaciente, nombreDueno, edad, (Categoria) categoriaObject, (Raza) razaObject, sexo, fechaActualString, altura, peso, idUnico, pelaje, fechaNacimiento);
        pacienteRepository.create(paciente);
    }

    public void crearCita()  {
        // Dia de la cita
        System.out.print("Dia de la cita: ");
        String diaCita = scanner.nextLine();

        // Hora de la cita
        System.out.print("Hora de la cita: ");
        String horaCita = scanner.nextLine();

        // Elegir paciente
        System.out.print("Elije el paciente: \n");
        List<Object> pacientesList = pacienteRepository.get();
        for (int i = 0; i < pacientesList.size(); i++) {
            System.out.println(i + ". " + ((Paciente) pacientesList.get(i)).getNombre());
        }
        String pacienteIndex = scanner.nextLine();
        Object pacienteObject = pacientesList.get(Integer.parseInt(pacienteIndex));

        // Motivo de la cita
        System.out.print("Motivo de la cita: ");
        String motivoCita = scanner.nextLine();

        // Crear la cita
        Cita cita = new Cita(diaCita, horaCita, (Paciente) pacienteObject, motivoCita);
        citaRepository.create(cita);
    }

    public void crearVacuna() {
        // Crear vacuna
        // Nombre de la vacuna
        System.out.print("Nombre de la vacuna: ");
        String nombreVacuna = scanner.nextLine();

        // Descripcion de la vacuna
        System.out.print("Descripcion de la vacuna: ");
        String descripcionVacuna = scanner.nextLine();

        // Crear la vacuna
        Vacuna vacuna = new Vacuna(nombreVacuna, descripcionVacuna);
        vacunaRepository.create(vacuna);
    }

    public void crearMedicina() {
        // Nombre de la medicina
        System.out.print("Nombre de la medicina: ");
        String nombreMedicina = scanner.nextLine();

        // Crear la medicina
        Medicina medicina = new Medicina(nombreMedicina);
        medicinaRepository.create(medicina);
    }

    public void verPacientes() {
        List<Object> pacientesList = pacienteRepository.get();
        for (Object o : pacientesList) {
            ((Paciente) o).show();
        }
    }

    public void verRazas() {
        List<Object> razasList = razaRepository.get();
        for (Object o : razasList) {
            ((Raza) o).show();
        }
    }

    public void verCategorias() {
        List<Object> categoriasList = categoriaRepository.get();
        for (Object o : categoriasList) {
            ((Categoria) o).show();
        }
    }

    public void verCitas() {
        List<Object> citasList = citaRepository.get();
        for (Object o : citasList) {
            ((Cita) o).show();
        }
    }

    public void verExpedientes() {
        List<Object> expedientesList = expedienteRepository.get();
        for (Object o : expedientesList) {
            ((Expediente) o).show();
        }
    }

    public void verVacunas() {
        List<Object> vacunasList = vacunaRepository.get();
        for (Object o : vacunasList) {
            ((Vacuna) o).show();
        }
    }

    public void verMedicinas() {
        List<Object> medicinasList = medicinaRepository.get();
        for (Object o : medicinasList) {
            ((Medicina) o).show();
        }
    }
}
