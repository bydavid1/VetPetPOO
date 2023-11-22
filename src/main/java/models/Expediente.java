package models;

import interfaces.IModel;

import java.util.List;

public class Expediente implements IModel {
    private int id;
    private Paciente paciente;
    private Cita cita;
    private String diagnostico;
    private String medicamentos;
    private List<Vacuna> vacunas;

    @Override
    public void show() {
        System.out.println("Paciente: " + this.paciente);
        System.out.println("Cita: " + this.cita);
        System.out.println("Diagnostico: " + this.diagnostico);
        System.out.println("Medicamentos: " + this.medicamentos);
        System.out.println("Vacunas: " + this.vacunas);
    }
}
