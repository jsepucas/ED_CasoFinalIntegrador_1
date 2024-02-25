
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;

class d_PlanificadorDeTareas extends Exception {
    public AsignacionTareaException(String mensaje) {
        super(mensaje);
    }
}
class MiembroTripulacion {
    private String nombre;
    private int cargaTrabajo;

    public MiembroTripulacion(String nombre) {
        this.nombre = nombre;
        this.cargaTrabajo = 0; // Inicialmente, la carga de trabajo es 0.
    }

