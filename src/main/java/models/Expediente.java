package models;

import interfaces.IModel;

import java.util.List;

public class Expediente implements IModel {
    private Paciente paciente;
    private int idPaciente;
    private Cita cita;
    private int idCita;
    private String diagnostico;
    private String medicamentos;
    private String vacunas;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getVacunas() {
        return vacunas;
    }

    public void setVacunas(String vacunas) {
        this.vacunas = vacunas;
    }

    @Override
    public void show() {
        System.out.println("Paciente: " + this.paciente);
        System.out.println("Cita: " + this.cita);
        System.out.println("Diagnostico: " + this.diagnostico);
        System.out.println("Medicamentos: " + this.medicamentos);
        System.out.println("Vacunas: " + this.vacunas);
    }
}
