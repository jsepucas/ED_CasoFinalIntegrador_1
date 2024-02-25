import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class Recursos_Suministros_Test {

    @Test
    public void testCalcularSuministros() {
        double tiempo = 365;
        double suministros = 100;
        double suministrosPlaneta = 100;
        Object _Recursos_Suministros = null;
        double suministrosCalculados = _Recursos_Suministros.getClass().getModifiers();
        assertEquals(100, suministrosCalculados, 0.1);
    }

    @Test
    public void testVisualizarSuministros() throws InterruptedException {
        double suministros = 100;
        Object a_Recursos_Suministros = null;
        a_Recursos_Suministros.wait();
    }

    @Test
    public void testIdentificarLimitesDeDatos() {
        a_CrónometroCósmico.identificarLimitesDeDatos();
    }
}