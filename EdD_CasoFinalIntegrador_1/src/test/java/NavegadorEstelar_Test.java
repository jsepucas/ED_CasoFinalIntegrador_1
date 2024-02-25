import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class NavegadorEstelar_Test {

    @org.junit.Test

    public void testMultiplicacionMatriz() {
        // Crear y configurar matrices de prueba
        Matriz a = new Matriz(2, 3);
        a.establecerValor(0, 0, 1);
        a.establecerValor(0, 1, 2);
        a.establecerValor(0, 2, 3);
        a.establecerValor(1, 0, 4);
        a.establecerValor(1, 1, 5);
        a.establecerValor(1, 2, 6);

        Matriz b = new Matriz(3, 2);
        b.establecerValor(0, 0, 7);
        b.establecerValor(0, 1, 8);
        b.establecerValor(1, 0, 9);
        b.establecerValor(1, 1, 10);
        b.establecerValor(2, 0, 11);
        b.establecerValor(2, 1, 12);

        Matriz resultadoEsperado = new Matriz(2, 2);
        resultadoEsperado.establecerValor(0, 0, 58);
        resultadoEsperado.establecerValor(0, 1, 64);
        resultadoEsperado.establecerValor(1, 0, 139);
        resultadoEsperado.establecerValor(1, 1, 154);

        // Realizamos la multiplicación
        Matriz resultado = a.multiplicarPor(b);

        // Verificamos
        assertEquals(resultadoEsperado.obtenerValor(0, 0), resultado.obtenerValor(0, 0));
        assertEquals(resultadoEsperado.obtenerValor(0, 1), resultado.obtenerValor(0, 1));
        assertEquals(resultadoEsperado.obtenerValor(1, 0), resultado.obtenerValor(1, 0));
        assertEquals(resultadoEsperado.obtenerValor(1, 1), resultado.obtenerValor(1, 1));
    }
}