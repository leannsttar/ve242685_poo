package EJERCICIOS.ejercicio2.calculadoraAvanzada;

public class CalculadoraAvanzada {
    public double potencia(double num1, double num2) {
        return Math.pow(num1, num2);
    }

    public double opuesto(double num) {
        if (num == 0) return 0;
        return num - num - num;
    }

    public double factorial(double num) {
        double resultado = 1;
        for (int i = 2; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        CalculadoraAvanzada calc = new CalculadoraAvanzada();
        System.out.println(calc.potencia(10, 2));
        System.out.println(calc.opuesto( 79));
        System.out.println(calc.factorial(4));
    }
}
