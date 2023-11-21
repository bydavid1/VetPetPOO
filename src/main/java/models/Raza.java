package models;

import Helpers.Identifiable;
import interfaces.IModel;

import java.io.Serializable;

public class Raza extends Identifiable implements IModel, Serializable {

    private String nombre;

    public Raza(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void show() {
        System.out.println("Nombre: " + this.nombre);
    }
}
