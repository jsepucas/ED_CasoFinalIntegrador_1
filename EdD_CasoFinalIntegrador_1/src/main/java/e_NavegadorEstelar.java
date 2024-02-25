import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Clase para poder representar y operar con matrices
class e_NavegadorEstelar
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

