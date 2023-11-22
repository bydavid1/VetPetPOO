package models;

import interfaces.IModel;

import java.io.Serializable;

public class Vacuna implements IModel, Serializable {
    private int id;
    private String nombreVacuna;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreVacuna() {
        return nombreVacuna;
    }

    public void setNombreVacuna(String nombreVacuna) {
        this.nombreVacuna = nombreVacuna;
    }

    public Vacuna(String nombreVacuna) {
        this.nombreVacuna = nombreVacuna;
    }

    @Override
    public void show() {
        System.out.println("Nombre de la vacuna: " + this.nombreVacuna);
    }
}
