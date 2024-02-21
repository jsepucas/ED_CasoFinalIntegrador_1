public class Ejercicio_1 {

    public static void main(String[] args) {

        ConversorTiempo conversor = new ConversorTiempo();
        LimitesDatos limites = new LimitesDatos();

        // Un dia en la tierra:
        double segundosTierra  = 86400;
        double segundosPlanetaNuevo = conversor.convertirTiempoTierraAPlanetaNuevo(segundosTierra);
        System.out.println("Segundos en la Tierra: " + segundosTierra + " equivalen a " + segundosPlanetaNuevo + " segundos en el nuevo planeta.");

        limites.mostrarLimitesDatos();


    }
}

class ConversorTiempo {

    private double SegundosEnUnDiaEnLaTierra = 86400;
    private double SegundosEnUnAñoEnElPlaneta = 31536000;
    private double DiaEnPlanetaNuevoEnSegundas = 90000;
    private double AñoEnPlanetaNuevoEnSegundos = 32850000;

    public double convertirTiempoTierraAPlanetaNuevo(double segundosTierra) {
        return segundosTierra * (diaPlanetaNuevoEnSegundos / diaTierraEnSegundos);
    }

    public double convertirTiempoPlanetaNuevoATierra(double segundosPlanetaNuevo) {
        return segundosPlanetaNuevo * (diaTierraEnSegundos / diaPlanetaNuevoEnSegundos);
    }
}

static class LimitesDatos {
    public void mostrarLimitesDatos() {
        System.out.println("Máximo Integer: " + Integer.MAX_VALUE);
        System.out.println("Máximo Long: " + Long.MAX_VALUE);
        System.out.println("Máximo Float: " + Float.MAX_VALUE);
        System.out.println("Máximo Double: " + Double.MAX_VALUE);




}
