package models;

import interfaces.IModel;

import java.io.Serializable;

public class Categoria implements IModel, Serializable {
    private int id;
    private String nombre;

    public Categoria(String nombre) {
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

    public String toString() {
        return this.nombre;
    }
}
