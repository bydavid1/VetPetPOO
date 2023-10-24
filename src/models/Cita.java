package models;

import interfaces.IModel;

public class Cita implements IModel {
    private int id;
    private String dia;
    private String hora;
    private Paciente paciente;
    private String motivo;

    @Override
    public void show() {
        System.out.println("Dia: " + this.dia);
        System.out.println("Hora: " + this.hora);
        System.out.println("Paciente: " + this.paciente);
        System.out.println("Motivo: " + this.motivo);
    }
}
