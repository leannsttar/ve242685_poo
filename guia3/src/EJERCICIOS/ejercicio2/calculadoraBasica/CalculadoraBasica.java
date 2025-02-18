package EJERCICIOS.ejercicio2.calculadoraBasica;

public class CalculadoraBasica {

    public double suma(double operando1, double operando2) {
        return operando1 + operando2;
    }

    public double resta(double operando1, double operando2) {
        return operando1 - operando2;
    }

    public double division(double operando1, double operando2) {
        return operando1 / operando2;
    }

    public double multiplicacion(double operando1, double operando2) {
        return operando1 * operando2;
    }

    public static void main(String[] args) {
        CalculadoraBasica calc = new CalculadoraBasica();
        System.out.println(calc.suma(10, 2));
        System.out.println(calc.resta(10, 2));
        System.out.println(calc.division(10, 2));
        System.out.println(calc.multiplicacion(10, 2));
    }
}
