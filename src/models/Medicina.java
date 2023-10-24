package models;

import interfaces.IModel;

public class Medicina implements IModel {

    private int id;
    private String nombre;

    @Override
    public void show() {
        System.out.println("Medicina: " + nombre);
    }

}
