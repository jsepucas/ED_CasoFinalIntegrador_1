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

