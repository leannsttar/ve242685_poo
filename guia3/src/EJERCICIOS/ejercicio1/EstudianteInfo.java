package EJERCICIOS.ejercicio1;

public class EstudianteInfo {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("jose", "martinez", "jm678943");

        estudiante.setMateria("POO");
        estudiante.setMateria("DSS");
        estudiante.setMateria("BDD");
        estudiante.setMateria("ADS");
        estudiante.setMateria("SPL");

        estudiante.getAllInfo();
    }
}
