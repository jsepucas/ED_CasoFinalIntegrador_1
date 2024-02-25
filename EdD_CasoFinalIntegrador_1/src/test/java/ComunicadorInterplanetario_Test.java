import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComunicadorInterplanetario_Test {

    @Test
    void testContarVocales() {
        assertEquals(4, ComunicadorInterplanetario_Test.contarVocales("Hola Mundo"));
    }

    private static int contarVocales(String holaMundo) {
        return 0;
    }

    @Test
    void testInvertirMensaje() {
        assertEquals("odnuM aloH", ComunicadorInterplanetario_Test.invertirMensaje("Hola Mundo"));
    }

    private static String invertirMensaje(String holaMundo) {
        return holaMundo;
    }

    @Test
    void testVerificarPalindromo() {
        assertTrue(ComunicadorInterplanetario_Test.verificarPalindromo("ana"));
        assertFalse(ComunicadorInterplanetario_Test.verificarPalindromo("hola"));
    }

    private static boolean verificarPalindromo(String ana) {
        return false;
    }
}