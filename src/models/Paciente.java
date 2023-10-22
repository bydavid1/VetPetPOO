package models;

import modules.IPacientes;

public class Paciente implements IPacientes {
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

    @Override
    public void agregarPaciente(Paciente paciente) {

    }

    @Override
    public void editarPaciente(Paciente paciente) {

    }

    @Override
    public void darDeBaja(String idUnico) {

    }
}
