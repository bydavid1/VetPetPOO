package modules;

import models.Paciente;

public interface IPacientes {
    void agregarPaciente(Paciente paciente);
    void editarPaciente(Paciente paciente);
    void darDeBaja(String idUnico);
}
