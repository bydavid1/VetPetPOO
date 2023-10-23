import models.Categoria;
import models.Paciente;
import models.Raza;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando programa...");
        System.out.println("Creando categoria...");
        timer(1);
        Categoria categoria = new Categoria("Felino");
        System.out.println("Categoria creada: ");
        categoria.show();
        System.out.println("Creando raza...");
        timer(1);
        Raza raza = new Raza("Siames", categoria);
        System.out.println("Raza creada: ");
        raza.show();
        System.out.println("Creando paciente...");
        timer(3);
        Paciente paciente = new Paciente("Miau", "Juan", 2, categoria, raza, "Macho", "12/12/2020", 1.2, 2.3, "123", "Corto", "12/12/2020");
        System.out.println("Paciente creado: ");
        paciente.show();
    }

    private static void timer(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}