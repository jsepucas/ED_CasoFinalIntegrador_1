import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Clase para poder representar y operar con matrices
class Matriz {
    private final int[][] datos;

    public Matriz(int filas, int columnas) {
        datos = new int[filas][columnas];
    }

    public void establecerValor(int fila, int columna, int valor) {
        datos[fila][columna] = valor;
    }

    public int obtenerValor(int fila, int columna) {
        return datos[fila][columna];
    }

    public int getFilas() {
        return datos.length;
    }

    public int getColumnas() {
        return datos[0].length;
    }

public Matriz multiplicarPor(Matriz otra) throws IllegalArgumentException {
    if (this.getColumnas() != otra.getFilas()) {
        throw new IllegalArgumentException("Las matrices no son compatibles para la multiplicación.");
    }

    Matriz resultado = new Matriz(this.getFilas(), otra.getColumnas());
    for (int i = 0; i < resultado.getFilas(); i++) {
        for (int j = 0; j < resultado.getColumnas(); j++) {
            for (int k = 0; k < this.getColumnas(); k++) {
                resultado.datos[i][j] += this.datos[i][k] * otra.datos[k][j];
            }
        }
    }
    return resultado;
}
}

// Clase principal del Navegador Estelar
class NavegadorEstelar {
    private Matriz terreno;
    private Matriz rutas;

    public NavegadorEstelar(Matriz terreno) {
        this.terreno = terreno;
    }

    // Métodos para la planificación de rutas y otras funcionalidades
}
