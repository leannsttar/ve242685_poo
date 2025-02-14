package EjerciciosComplementarios;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;


public class AlumnosPoo {
    public static void main(String[] args) {
        Map<String, String> mapa = new HashMap<>();
        //Usuarios ya default para poder verlos
        mapa.put("VE242685", "Leandro");
        mapa.put("PE742565", "Pedro");
        mapa.put("JR873256", "Jose");


        Object[] opciones = {"Ingreso de Estudiante", "Ver estudiantes", "Buscar estudiante", "Salir"};
        boolean salir = true;

        while (salir) {
            int seleccion = JOptionPane.showOptionDialog(
                    null,
                    "Selecciona una opción para navegar",
                    "Programacion orientada a objetos",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            String carne;
            String estudiante;


            if (seleccion == 0) {
                carne = JOptionPane.showInputDialog("Ingresa el carne del estudiante");
                estudiante = JOptionPane.showInputDialog("Ingresa el nombre del estudiante");
                mapa.put(carne, estudiante);
            } else if (seleccion == 1) {
                StringBuilder mensaje = new StringBuilder("Lista de estudiantes:\n");
                for (Map.Entry<String, String> entry : mapa.entrySet()) {
                    mensaje.append("Carnet: ").append(entry.getKey()).append(" - Nombre: ").append(entry.getValue()).append("\n");
                }
                JOptionPane.showMessageDialog(null, mensaje.toString(), "Estudiantes Registrados", JOptionPane.INFORMATION_MESSAGE);
            } else if (seleccion == 2) {
                carne = JOptionPane.showInputDialog("Ingresa el carnet del estudiante a buscar:");
                if (mapa.containsKey(carne)) {
                    JOptionPane.showMessageDialog(null, "estudiante encontrado: " + mapa.get(carne), "Resultado la busqueda", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontro a ningun estudiante con ese carne: " + mapa.get(carne), "No resultados", JOptionPane.INFORMATION_MESSAGE);
                }
            } else if (seleccion == 3 || seleccion == JOptionPane.CLOSED_OPTION) {
                salir = false;
            }
        }
    }
}

