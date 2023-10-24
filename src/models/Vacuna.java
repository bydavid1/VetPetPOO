package models;

import interfaces.IModel;

public class Vacuna implements IModel {
    private int id;
    private String fechaVacuna;
    private String nombreVacuna;

    public Vacuna(String fechaVacuna, String nombreVacuna) {
        this.fechaVacuna = fechaVacuna;
        this.nombreVacuna = nombreVacuna;
    }

    public String getNombreVacuna() {
        return nombreVacuna;
    }

    @Override
    public void show() {
        System.out.println("Fecha de la vacuna: " + this.fechaVacuna);
        System.out.println("Nombre de la vacuna: " + this.nombreVacuna);
    }
}
