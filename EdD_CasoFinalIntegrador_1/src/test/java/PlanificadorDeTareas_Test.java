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

    @Test
    void testDistribucionEquitativaTareas() {
        planificador.distribuirTareas(tareas);

        // Verifica que cada miembro de la tripulación tenga al menos una tarea asignada
        // Asumiendo una distribución equitativa, cada miembro debería tener 2 tareas.
        planificador.tripulacion.forEach(miembro -> assertEquals(2, miembro.tareas.size()));
    }

