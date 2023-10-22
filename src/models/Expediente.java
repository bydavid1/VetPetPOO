package models;

import modules.IExpedientes;

import java.util.List;

public class Expediente implements IExpedientes {
    private Paciente paciente;
    private Cita cita;
    private String diagnostico;
    private String medicamentos;
    private List<Vacuna> vacunas;

    @Override
    public Expediente generarExpediente(Paciente paciente, Cita cita, String diagnostico, String medicamentos, List<Vacuna> vacunas) {
        return null;
    }
}
