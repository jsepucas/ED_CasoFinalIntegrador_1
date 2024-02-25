import java.util.Scanner;
public class a_CrónometroCósmico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Te damos la bienvenida al Cronómetro Cósmico");
        System.out.println("Introduce la duración del día en el nuevo planeta (en horas): ");
        double duracionDiaPlaneta = scanner.nextDouble();

        System.out.println("Introduce la duración del año en el nuevo planeta (en días): ");
        double duracionAñoPlaneta = scanner.nextDouble();

        System.out.println("Introduce el tiempo en la Tierra (en días): ");
        double tiempoTierra = scanner.nextDouble();

        double tiempoPlaneta = convertirTiempo(tiempoTierra, duracionDiaPlaneta, duracionAñoPlaneta);
        System.out.println("El tiempo equivalente en el nuevo planeta es: " + tiempoPlaneta + " días");

        visualizarTiempoEnFormatos(tiempoPlaneta);

        identificarLimitesDeDatos();

        scanner.close();
    }

    static double convertirTiempo(double tiempoTierra, double duracionDiaPlaneta, double duracionAnioPlaneta) {
        double tiempoPlaneta = tiempoTierra * (duracionAnioPlaneta / 365) * duracionDiaPlaneta;
        return tiempoPlaneta;
    }

    static void visualizarTiempoEnFormatos(double tiempoPlaneta) {
        System.out.println("Tiempo en el nuevo planeta (formato 1): " + tiempoPlaneta + " días");

    }

    static void identificarLimitesDeDatos(){

    }


}