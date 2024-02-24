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

        // Se solicita un número para listar los primeros n números primos

        System.out.print("¿Cuántos números primos necesita listar? ");
        int n = scanner.nextInt();
        listFirstNPrimes(n);

        // Se solicita un número para descomponer en factores primos

        System.out.print("Ingrese un número para descomponer en factores primos: ");
        int number = scanner.nextInt();
        decomposeInPrimes(number);

        scanner.close();
    }

    private static void listFirstNPrimes(int n) {
        int count = 0;
        int number = 2;
        System.out.println("Primeros " + n + " números primos son:");
        while (count < n) {
            if (isPrime(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void decomposeInPrimes(int number) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                factors.add(i);
                number /= i;
            }
        }
        System.out.println("Factores primos: " + factors);
    }
}