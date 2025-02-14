package EjerciciosComplementarios;

import javax.swing.*;


public class ModificarEjemplo {
    public static void main(String[] args) {
        String leer;
        int numEmpleados;
        double sueldo, mayor = 0, menor = 10000;
        int i = 1, contador = 0;


        leer = JOptionPane.showInputDialog("Ingrese el numero de empleados");
        numEmpleados = Integer.parseInt(leer);
        if (numEmpleados <= 0) {
            JOptionPane.showMessageDialog(null, "El número de empleados debe de ser mayor a cero", "Error de empleados", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }

        while (i <= numEmpleados) {
            leer = JOptionPane.showInputDialog("Ingrese el Sueldo del Empleado " + i);
            sueldo = Double.parseDouble(leer);
            if (sueldo < 0) {
                JOptionPane.showMessageDialog(null, "No se permiten valores negativos, vuelva a digitar el sueldo", "Error de sueldo", JOptionPane.INFORMATION_MESSAGE);
                continue;
            }
            if (sueldo > 300)
                contador = contador + 1;
            if (sueldo > mayor)
                mayor = sueldo;
            if (sueldo < menor)
                menor = sueldo;
            i = i + 1;
        }
        JOptionPane.showMessageDialog(null, " El sueldo Mayor es de $: " + mayor +
                "\nEl sueldo Menor es de $: " + menor +
                "\n" + contador + " Empleados tienen un sueldo mayor de $300");
    }


}

