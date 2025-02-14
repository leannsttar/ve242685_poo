package EjerciciosComplementarios;
import java.util.Scanner;


public class CalcularAprobar {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        float nota;


        System.out.print("Ingrese su nota: ");
        nota = reader.nextFloat();


        if (nota >= 7) {
            System.out.println("Usted aprobó");
        } else if (nota >= 6.50 && nota <= 6.99) {
            System.out.println("Usted puede realizar un test de suficiencia");
        } else {
            System.out.println("Usted reprobó");
        }
    }
}
