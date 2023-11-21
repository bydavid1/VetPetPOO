package models;

import interfaces.IModel;

import java.io.Serializable;

public class Categoria implements IModel, Serializable {
    private int id;
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
