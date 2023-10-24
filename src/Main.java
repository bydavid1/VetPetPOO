import models.*;
import repositories.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // menu de opciones para crear razas, categorias y pacientes
        Scanner scanner = new Scanner(System.in);

        // Inicializacion de repositorios (Modelo temporal para pruebas, luego se hara la im=nnterfaz y se creara persistencia de datos)
        RazaRepository razaRepository = new RazaRepository();
        CategoriaRepository categoriaRepository = new CategoriaRepository();
        PacienteRepository pacienteRepository = new PacienteRepository();
        CitaRepository citaRepository = new CitaRepository();
        ExpedienteRepository expedienteRepository = new ExpedienteRepository();
        VacunaRepository vacunaRepository = new VacunaRepository();
        MedicinaRepository medicinaRepository = new MedicinaRepository();

        int opcion = 0;

        do {
            System.out.println("---------------------");
            System.out.println("Menu");
            System.out.println("---------------------");
            System.out.println("1. Crear raza");
            System.out.println("2. Crear categoria");
            System.out.println("3. Crear paciente");
            System.out.println("4. Crear cita");
            System.out.println("5. Crear vacuna");
            System.out.println("6. Crear medicina");
            System.out.println("7. Ver pacientes");
            System.out.println("8. Ver razas");
            System.out.println("9. Ver categorias");
            System.out.println("10. Ver citas");
            System.out.println("11. Ver expedientes");
            System.out.println("12. Ver vacunas");
            System.out.println("13. Ver medicinas");
            System.out.println("14. Salir");
            System.out.print("Opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (opcion) {
                    case 1:
                        System.out.print("Nombre de la raza: ");
                        String nombreRaza = scanner.nextLine();
                        Raza raza = new Raza(nombreRaza);
                        razaRepository.create(raza);
                        break;
                    case 2:
                        System.out.print("Nombre de la categoria: ");
                        String nombreCategoria = scanner.nextLine();
                        Categoria categoria = new Categoria(nombreCategoria);
                        // Guardar en el repositorio
                        categoriaRepository.create(categoria);
                        break;
                    case 3:
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
                        break;
                    case 4:
                        // Crear cita
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
                        break;
                    case 5:
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
                        break;
                    case 6:
                        // Crear medicina
                        // Nombre de la medicina
                        System.out.print("Nombre de la medicina: ");
                        String nombreMedicina = scanner.nextLine();

                        // Crear la medicina
                        Medicina medicina = new Medicina(nombreMedicina);
                        medicinaRepository.create(medicina);
                        break;
                    case 7:
                        List<Object> pacientes = pacienteRepository.get();
                        for (Object o : pacientes) {
                            ((Paciente) o).show();
                        }
                        break;
                    case 8:
                        List<Object> razasList = razaRepository.get();
                        for (Object o : razasList) {
                            ((Raza) o).show();
                        }
                        break;
                    case 9:
                        List<Object> categoriasList = categoriaRepository.get();
                        for (Object o : categoriasList) {
                            ((Categoria) o).show();
                        }
                        break;

                    case 10:
                        List<Object> citasList = citaRepository.get();
                        for (Object o : citasList) {
                            ((Cita) o).show();
                        }
                        break;
                    case 11:
                        List<Object> expedientesList = expedienteRepository.get();
                        for (Object o : expedientesList) {
                            ((Expediente) o).show();
                        }
                        break;
                    case 12:
                        List<Object> vacunasList = vacunaRepository.get();
                        for (Object o : vacunasList) {
                            ((Vacuna) o).show();
                        }
                        break;
                    case 13:
                        List<Object> medicinasList = medicinaRepository.get();
                        for (Object o : medicinasList) {
                            ((Medicina) o).show();
                        }
                        break;
                    case 14:
                        System.out.println("Adios");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Occurio un error, volviendo al menu");
            }
        } while (opcion != 4);
    }
}