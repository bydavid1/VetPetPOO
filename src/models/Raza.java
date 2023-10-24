package models;

import interfaces.IModel;

public class Raza implements IModel {
    private int id;
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
