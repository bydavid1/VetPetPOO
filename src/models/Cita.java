package models;

import modules.ICitas;

public class Cita implements ICitas {
    private String dia;
    private String hora;
    private Paciente paciente;
    private String motivo;

    @Override
    public void agendarCita(Cita cita) {

    }

    @Override
    public void editarCita(String idCita, Cita cita) {

    }

    @Override
    public void eliminarCita(String idCita) {

    }
}
