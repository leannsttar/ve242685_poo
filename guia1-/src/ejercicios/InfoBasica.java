package ejercicios;

import java.util.Scanner;

public class InfoBasica {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Digite sus nombres: ");
        String nombres = reader.nextLine();
        System.out.print("Digite sus apellidos: ");
        String apellidos = reader.nextLine();
        System.out.print("Digite su edad: ");
        String edad = reader.nextLine();
        System.out.print("Digite su carrera: ");
        String carrera = reader.nextLine();
        System.out.println("\nNombres: " + nombres);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
    }
}