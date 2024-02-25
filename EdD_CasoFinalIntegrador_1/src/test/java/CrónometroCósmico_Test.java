import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CrónometroCósmico_Test {

    @Test
    public void testConvertirTiempo() {
        double duracionDiaPlaneta = 24; // Suponiendo que un día en el planeta es igual a 24 horas terrestres
        double duracionAnioPlaneta = 365; // Suponiendo que un año en el planeta es igual a 365 días terrestres
        double tiempoTierra = 365; // 1 año terrestre

