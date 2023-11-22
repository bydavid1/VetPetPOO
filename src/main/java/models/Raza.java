package models;

import interfaces.IModel;

import java.io.Serializable;

public class Raza implements IModel, Serializable {
    private int id;
    private String nombre;

    public Raza(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }

    @Override
    public void show() {
        System.out.println("Nombre: " + this.nombre);
    }
}
