package ejercicios;

import java.awt.Component;
import javax.swing.JOptionPane;

public class SumaEnteros2 {
    public static void main(String[] args) {
        String primernumero = JOptionPane.showInputDialog("Digite el primer numero");
        String segundonumero = JOptionPane.showInputDialog("Digite el segundo numero");
        int numero1 = Integer.parseInt(primernumero);
        int numero2 = Integer.parseInt(segundonumero);
        if (numero1 >= 0 && numero2 >= 0) {
            int suma = numero1 + numero2;
            JOptionPane.showMessageDialog((Component)null, "La suma es: " + suma, "Resultado", -1);
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog((Component)null, "No puede ingresar numeros negativos");
        }
    }
}