import java.util.Scanner;

public class LecturaConsola {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String nombre = "";
        System.out.print("Ingrese su nombre: ");
        nombre = reader.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = reader.nextInt();
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
   