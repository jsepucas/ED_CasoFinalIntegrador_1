import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlanificadorDeTareas_Test {

    private d_PlanificadorDeTareas planificador;
    private List<Tarea> tareas;

    @BeforeEach
    void setUp() {
        planificador = new d_PlanificadorDeTareas();
        tareas = new ArrayList<>();

        tareas.add(new Tarea("Tarea 1", 3));
        tareas.add(new Tarea("Tarea 2", 2));
        tareas.add(new Tarea("Tarea 3", 4));
        tareas.add(new Tarea("Tarea 4", 5));

        MiembroTripulacion miembro1 = new MiembroTripulacion("Juan");
        MiembroTripulacion miembro2 = new MiembroTripulacion("Lorena");

        planificador.agregarMiembro(miembro1);
        planificador.agregarMiembro(miembro2);
    }

