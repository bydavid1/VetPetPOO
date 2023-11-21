package models;

import Helpers.Identifiable;
import interfaces.IModel;

public class Vacuna extends Identifiable implements IModel {
    private int id;
    private String nombreVacuna;

    public Vacuna(String nombreVacuna) {
        this.nombreVacuna = nombreVacuna;
    }

    public String getNombreVacuna() {
        return nombreVacuna;
    }

    @Override
    public void show() {
        System.out.println("Nombre de la vacuna: " + this.nombreVacuna);
    }
}
