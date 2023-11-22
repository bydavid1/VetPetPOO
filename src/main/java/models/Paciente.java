package models;

import interfaces.IModel;

import java.io.Serializable;

public class Paciente implements IModel, Serializable {
    private int id;
    private String nombre;
    private String nombreDueno;
    private int edad;
    private int idCategoria;
    private Categoria categoria;
    private int idRaza;
    private Raza raza;
    private String sexo;
    private String fechaInscripcion;
    private double altura;
    private double peso;
    private String idUnico;
    private String pelaje;
    private String fechaNacimiento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public int getEdad() {
        return edad;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public int getIdRaza() {
        return idRaza;
    }

    public Raza getRaza() {
        return raza;
    }

    public String getSexo() {
        return sexo;
    }

    public String getFechaInscripcion() {
        return fechaInscripcion;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getIdUnico() {
        return idUnico;
    }

    public String getPelaje() {
        return pelaje;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setFechaInscripcion(String fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setIdUnico(String idUnico) {
        this.idUnico = idUnico;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public void setIdRaza(int idRaza) {
        this.idRaza = idRaza;
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

    public String toString() {
        return this.nombre;
    }
}
