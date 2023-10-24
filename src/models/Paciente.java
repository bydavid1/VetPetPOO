package models;

import interfaces.IModel;

public class Paciente implements IModel {
    private int id;
    private String nombre;
    private String nombreDueno;
    private int edad;
    private Categoria categoria;
    private Raza raza;
    private String sexo;
    private String fechaInscripcion;
    private double altura;
    private double peso;
    private String idUnico;
    private String pelaje;
    private String fechaNacimiento;

    public Paciente(String nombre, String nombreDueno, int edad, Categoria categoria, Raza raza, String sexo, String fechaInscripcion, double altura, double peso, String idUnico, String pelaje, String fechaNacimiento) {
        this.nombre = nombre;
        this.nombreDueno = nombreDueno;
        this.edad = edad;
        this.categoria = categoria;
        this.raza = raza;
        this.sexo = sexo;
        this.fechaInscripcion = fechaInscripcion;
        this.altura = altura;
        this.peso = peso;
        this.idUnico = idUnico;
        this.pelaje = pelaje;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public void show() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Nombre del dueño: " + this.nombreDueno);
        System.out.println("Edad: " + this.edad);
        System.out.println("Categoria: " + this.categoria.getNombre());
        System.out.println("Raza: " + this.raza.getNombre());
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Fecha de inscripción: " + this.fechaInscripcion);
        System.out.println("Altura: " + this.altura);
        System.out.println("Peso: " + this.peso);
        System.out.println("ID único: " + this.idUnico);
        System.out.println("Pelaje: " + this.pelaje);
        System.out.println("Fecha de nacimiento: " + this.fechaNacimiento);
    }
}
