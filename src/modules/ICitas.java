package modules;

import models.Cita;

public interface ICitas {
    void agendarCita(Cita cita);
    void editarCita(String idCita, Cita cita);
    void eliminarCita(String idCita);
}
