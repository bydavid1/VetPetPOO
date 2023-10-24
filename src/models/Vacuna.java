package models;

import interfaces.IModel;

public class Vacuna implements IModel {
    private int id;
    private String fechaVacuna;
    private String nombreVacuna;

    @Override
    public void show() {
        System.out.println("Fecha de la vacuna: " + this.fechaVacuna);
        System.out.println("Nombre de la vacuna: " + this.nombreVacuna);
    }
}
