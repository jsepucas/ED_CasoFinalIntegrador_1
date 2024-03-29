import java.util.ArrayList;
import java.util.List;

// Se crea una clase para el planificador de tareas

public class d_PlanificadorDeTareas {
    public List<MiembroTripulacion> tripulacion;

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

    public void mostrarHorarios() {
        for (MiembroTripulacion miembro : tripulacion) {
            System.out.println("Horario de " + miembro.getNombre() + ":");
            miembro.mostrarTareas();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        d_PlanificadorDeTareas planificador = new d_PlanificadorDeTareas();

        MiembroTripulacion miembro1 = new MiembroTripulacion("Juan");
        MiembroTripulacion miembro2 = new MiembroTripulacion("Lorena");

        planificador.agregarMiembro(miembro1);
        planificador.agregarMiembro(miembro2);

        List<Tarea> tareas = new ArrayList<>();
        tareas.add(new Tarea("Tarea 1", 3)); // Tarea con duración de 3 horas
        tareas.add(new Tarea("Tarea 2", 2)); // Tarea con duración de 2 horas
        tareas.add(new Tarea("Tarea 3", 4)); // Tarea con duración de 4 horas
        tareas.add(new Tarea("Tarea 4", 5)); // Tarea con duración de 5 horas

        planificador.distribuirTareas(tareas);
        planificador.mostrarHorarios();
    }

    public String planificar() {
        return "Hola!, soy un planificador de tareas";
    }
}

class MiembroTripulacion {
    private String nombre;
    public List<Tarea> tareas;

    public MiembroTripulacion(String nombre) {
        this.nombre = nombre;
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public void mostrarTareas() {
        for (Tarea tarea : tareas) {
            System.out.println(tarea.getNombre() + ": " + tarea.getDuracion() + " horas");
        }
    }

    public String getNombre() {
        return nombre;
    }
}

// Creamos una clase para las tareas

class Tarea {
    private String nombre;
    private int duracion;

    public Tarea(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracion() {
        return duracion;
    }
}