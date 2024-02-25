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
    public class ComunicadorInterplanetario {

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

        // Método en el que invertimos el mensaje
        public static String invertirMensaje(String mensaje) {
            return new StringBuilder(mensaje).reverse().toString();
        }

        // Aquí comprobamos si el mensaje es un palíndromo
        public static boolean esPalindromo(String mensaje) {
            String mensajeLimpiado = mensaje.toLowerCase().replaceAll("\\s+", "");
            return mensajeLimpiado.equals(new StringBuilder(mensajeLimpiado).reverse().toString());
        }
    }

