public class Ejercicio_1 {

    public static void main(String[] args) {

        TimeConverter converter = new TimeConverter();
        DataLimits dataLimits = new DataLimits();

        // Un dia en la tierra:
        double earthSeconds = 86400;
        double newPlanetSeconds = converter.convertEarthTimeToNewPlanet(earthSeconds);
        System.out.println("Tiempo en la Tierra (segundos): " + earthSeconds);
        System.out.println("Equivalente en el nuevo planeta (segundos): " + newPlanetSeconds);

        dataLimits.showDataLimits();


    }
}

class TimeConverter {

    private double SegundosEnUnDiaEnLaTierra = 86400;
    private double SegundosEnUnAñoEnElPlaneta = 31536000;

}
