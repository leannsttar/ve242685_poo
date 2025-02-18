package EJERCICIOS.ejercicio1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    String nombre;
    String apellido;
    String codigo;
    private List<String> materias = new ArrayList<>();

    Estudiante(String nombre, String apellido, String codigo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
    }

    public void setMateria(String materia) {
        this.materias.add(materia);
    }

    public void getAllInfo(){
        StringBuilder mensaje = new StringBuilder("Nombre: " + nombre + "\nApellido: " + apellido + "\nCodigo: " + codigo);
        mensaje.append("\n\nLista de materias \n");
        for (String item : materias) {
            mensaje.append("Materia: ").append(item).append("\n");
        }
        JOptionPane.showConfirmDialog(null,mensaje);
    }
}
