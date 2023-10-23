package models;

import interfaces.IModel;

public class Raza implements IModel {
    private String nombre;
    private Categoria categoria;

    public Raza(String nombre, Categoria categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
    }

    @Override
    public void show() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Categoria: " + this.categoria);
    }
}
