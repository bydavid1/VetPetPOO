package models;

import Helpers.Identifiable;
import interfaces.IModel;

import java.io.Serializable;

public class Categoria extends Identifiable implements IModel, Serializable {
    private String nombre;

    public Categoria(String nombre) {
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
