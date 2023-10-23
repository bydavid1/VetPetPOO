package models;

import interfaces.IModel;

public class Categoria implements IModel {
    private String nombre;

    public Categoria(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void show() {
        System.out.println("Nombre: " + this.nombre);
    }
}
