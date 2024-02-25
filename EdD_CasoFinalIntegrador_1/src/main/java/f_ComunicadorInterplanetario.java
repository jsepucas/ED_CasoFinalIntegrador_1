public class f_ComunicadorInterplanetario {

    // Método para contar vocales en un mensaje
    public static int contarVocales(String mensaje) {
        int contador = 0;
        for (char c : mensaje.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }

