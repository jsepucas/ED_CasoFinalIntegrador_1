import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

@Test
public void testConvertirTiempo() {
    // Preparación
    double tiempoTierra = 365; // 1 año terrestre
    double duracionDiaPlaneta = 24; // La duración del día en el nuevo planeta es igual a la de la Tierra
    double duracionAnioPlaneta = 365; // La duración del año en el nuevo planeta es igual a la de la Tierra

    // Ejecución
    double tiempoPlaneta = a_CrónometroCósmico.convertirTiempo(tiempoTierra, duracionDiaPlaneta, duracionAnioPlaneta);

    // Verificación
    assertEquals(8760.0, tiempoPlaneta, 0.001, "El tiempo en el planeta debería ser igual al tiempo en la Tierra cuando las duraciones del día y del año son las mismas, convertido en horas.");
}

public void main() {
}
