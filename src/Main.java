import models.*;
import repositories.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inicializar el scanner
        Scanner scanner = new Scanner(System.in);
        // Inicializar el manjeador del menu
        MenuHandler menuHandler = new MenuHandler();

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
                        menuHandler.crearRaza();
                        break;
                    case 2:
                        menuHandler.crearCategoria();
                        break;
                    case 3:
                        menuHandler.crearPaciente();
                        break;
                    case 4:
                        menuHandler.crearCita();
                        break;
                    case 5:
                        menuHandler.crearVacuna();
                        break;
                    case 6:
                        menuHandler.crearMedicina();
                        break;
                    case 7:
                        menuHandler.verPacientes();
                        break;
                    case 8:
                        menuHandler.verRazas();
                        break;
                    case 9:
                        menuHandler.verCategorias();
                        break;
                    case 10:
                        menuHandler.verCitas();
                        break;
                    case 11:
                        menuHandler.verExpedientes();
                        break;
                    case 12:
                        menuHandler.verVacunas();
                        break;
                    case 13:
                        menuHandler.verMedicinas();
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