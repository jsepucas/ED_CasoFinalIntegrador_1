package RecursosySuministros;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Ejercicio_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de periodos a analizar (en múltiplos de 5 días):");
        int periodos = scanner.nextInt();

        ArrayList<Integer> consumoAgua = new ArrayList<>();
        ArrayList<Integer> consumoComida = new ArrayList<>();
        ArrayList<Integer> consumoOxigeno = new ArrayList<>();

        for (int i = 0; i < periodos; i++) {
            System.out.println("Periodo " + (i + 1) + ":");
            System.out.println("Introduce el consumo de agua (litros):");
            consumoAgua.add(scanner.nextInt());
            System.out.println("Introduce el consumo de comida (kilogramos):");
            consumoComida.add(scanner.nextInt());
            System.out.println("Introduce el consumo de oxígeno (litros):");
            consumoOxigeno.add(scanner.nextInt());

        }

        mostrarEstadisticas("Agua", consumoAgua);
        mostrarEstadisticas("Comida", consumoComida);
        mostrarEstadisticas("Oxígeno", consumoOxigeno);

    }

    public static void mostrarEstadisticas(String recurso, ArrayList<Integer> consumos) {
        int suma = 0;
        for (int consumo : consumos) {
            suma += consumo;

        }
        int media = suma / consumos.size();
        int minimo = Collections.min(consumos);
        int maximo = Collections.max(consumos);

        System.out.println("Estadísticas de " + recurso + ":");
        System.out.println("Media: " + media);
        System.out.println("Mínimo: " + minimo);
        System.out.println("Máximo: " + maximo);




    }


