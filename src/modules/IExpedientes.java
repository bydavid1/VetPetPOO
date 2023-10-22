package modules;

import models.Cita;
import models.Expediente;
import models.Paciente;
import models.Vacuna;

import java.util.List;

public interface IExpedientes {
    Expediente generarExpediente(Paciente paciente, Cita cita, String diagnostico, String medicamentos, List<Vacuna> vacunas);
}
