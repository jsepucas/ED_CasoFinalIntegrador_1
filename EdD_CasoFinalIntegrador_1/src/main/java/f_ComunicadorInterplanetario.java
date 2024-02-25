import java.util.Scanner;

public class f_ComunicadorInterplanetario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Comunicador Interplanetario");
        System.out.print("Introduzca su mensaje: ");
        String mensaje = scanner.nextLine();

        System.out.println("Análisis de mensaje en curso...");
        int numeroDeVocales = contarVocales(mensaje);
        System.out.println("Número de vocales (señales importantes) en el mensaje: " + numeroDeVocales);

        String mensajeInvertido = invertirMensaje(mensaje);
        System.out.println("Mensaje invertido (para descifrar códigos): " + mensajeInvertido);

        boolean esPalindromo = verificarPalindromo(mensaje);
        System.out.println("¿El mensaje es un palíndromo (integridad del mensaje)?: " + esPalindromo);
    }