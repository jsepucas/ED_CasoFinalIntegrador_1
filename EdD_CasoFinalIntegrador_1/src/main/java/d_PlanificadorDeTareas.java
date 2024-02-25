import java.util.ArrayList;
import java.util.List;

// Se crea una clase para el planificador de tareas

public class d_PlanificadorDeTareas {
    private List<MiembroTripulacion> tripulacion;

    public d_PlanificadorDeTareas() {
        this.tripulacion = new ArrayList<>();
    }

    public void agregarMiembro(MiembroTripulacion miembro) {
        tripulacion.add(miembro);
    }

    public void distribuirTareas(List<Tarea> tareas) {
        int totalTareas = tareas.size();
        int totalMiembros = tripulacion.size();
        int indiceTarea = 0;
        for (int i = 0; i < totalMiembros; i++) {
            MiembroTripulacion miembro = tripulacion.get(i);
            int tareasAsignadas = Math.min(totalTareas / totalMiembros, totalTareas - indiceTarea);
            for (int j = 0; j < tareasAsignadas; j++) {
                miembro.agregarTarea(tareas.get(indiceTarea));
                indiceTarea++;
            }
        }
    }
