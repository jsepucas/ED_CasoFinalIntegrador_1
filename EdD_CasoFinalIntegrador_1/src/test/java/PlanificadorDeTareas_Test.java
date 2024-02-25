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

    @Test
    void testContenidoTareasAsignadas() {
        planificador.distribuirTareas(tareas);

        // Se verifica que las tareas asignadas sean correctas en términos de duración total

        int totalHorasMiembro1 = planificador.tripulacion.get(0).tareas.stream().mapToInt(Tarea::getDuracion).sum();
        int totalHorasMiembro2 = planificador.tripulacion.get(1).tareas.stream().mapToInt(Tarea::getDuracion).sum();

        // La suma de duraciones puede no ser exactamente igual debido a la división de tareas,
        // pero debería estar relativamente balanceada


        assertEquals(5, totalHorasMiembro1, "Las horas asignadas al miembro 1 no son las esperadas.");
        assertEquals(9, totalHorasMiembro2, "Las horas asignadas al miembro 2 no son las esperadas.");
    }
}

