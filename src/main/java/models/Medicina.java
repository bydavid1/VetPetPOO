package models;

import Helpers.Identifiable;
import interfaces.IModel;

public class Medicina extends Identifiable implements IModel {

    private int id;
    private String nombre;

    public Medicina(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void show() {
        System.out.println("Medicina: " + nombre);
    }

}
