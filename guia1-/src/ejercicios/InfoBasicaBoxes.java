package ejercicios;

import java.awt.Component;
import javax.swing.JOptionPane;

public class InfoBasicaBoxes {
    public static void main(String[] args) {
        String nombres = JOptionPane.showInputDialog("Ingrese sus nombres: ");
        String apellidos = JOptionPane.showInputDialog("Ingrese sus apellidos: ");
        String edad = JOptionPane.showInputDialog("Ingrese su edad: ");
        String carrera = JOptionPane.showInputDialog("Ingrese su carrera: ");
        String mensaje = "Nombres: " + nombres + "\nApellidos: " + apellidos + "\nEdad: " + edad + "\nCarrera: " + carrera;
        JOptionPane.showMessageDialog((Component)null, mensaje, "Información básica", 1);
    }
}
