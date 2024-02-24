import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class c_SistemaDeAlertaYMonitoreo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Se le preguntan los datos al usuario
        System.out.print("Introduce el nivel de radiación: ");
        double radiationLevel = scanner.nextDouble();

        System.out.print("Introdce la temperatura: ");
        double temperature = scanner.nextDouble();

        System.out.print("Introduce la presión: ");
        double pressure = scanner.nextDouble();

        // Se verifican las condiciones extremas

        if (radiationLevel > 5) System.out.println("Alerta: El nivel de radiación alto");
        if (temperature > 30) System.out.println("Alerta: La Temperatura es alta");
        if (pressure < 960) System.out.println("Alerta: La presión es baja");

    }
