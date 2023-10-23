package models;

import interfaces.IModel;

public class Vacuna implements IModel {
    private String fechaVacuna;
    private String nombreVacuna;
    private double peso;
    private double altura;
    private int edad;

    @Override
    public void show() {
        System.out.println("Fecha de la vacuna: " + this.fechaVacuna);
        System.out.println("Nombre de la vacuna: " + this.nombreVacuna);
        System.out.println("Peso: " + this.peso);
        System.out.println("Altura: " + this.altura);
        System.out.println("Edad: " + this.edad);
    }
}
