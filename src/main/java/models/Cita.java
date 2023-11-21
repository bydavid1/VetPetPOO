package models;

import interfaces.IModel;

import java.io.Serializable;

public class Cita implements IModel, Serializable {
    
    private int id;
    private String fecha;
    private String hora;
    private Paciente paciente;
    private String motivo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Cita() {}

    @Override
    public void show() {
        System.out.println("Fecha: " + this.fecha);
        System.out.println("Hora: " + this.hora);
        System.out.println("Paciente: " + this.paciente);
        System.out.println("Motivo: " + this.motivo);
    }
}
