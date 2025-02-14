package ejercicios;

public class LecturaParametrosValidado {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Error: Debes ingresar al menos dos parámetros.");
        } else {
            System.out.println("Parametro 1: " + args[0]);
            System.out.println("Parametro 2: " + args[1]);
        }
    }
}