package models;

import interfaces.IModel;

public class Paciente implements IModel {
    private String id;
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

    public void setId(String id) {
        this.id = id;
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

    public String generateUniqueId() {
        String id = "";
        String[] nombreSplit = this.nombre.split(" ");
        String[] nombreDuenoSplit = this.nombreDueno.split(" ");
        String[] fechaNacimientoSplit = this.fechaNacimiento.split("/");
        String[] fechaInscripcionSplit = this.fechaInscripcion.split("/");
        id += nombreSplit[0].charAt(0);
        id += nombreDuenoSplit[0].charAt(0);
        id += fechaNacimientoSplit[0];
        id += fechaInscripcionSplit[0];
        id += fechaInscripcionSplit[1];
        id += fechaInscripcionSplit[2];
        return id;
    }
}
