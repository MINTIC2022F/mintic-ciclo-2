package semana.cuatro;

public class Calculadora {

    public double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public double restar(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public double dividir(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            return Double.NaN;
        }
    }

    public Double obtenerPotencia(double num1, double num2) {
        if (num2 < num1) {
            return Math.pow(num1, num2);
        } else {
            return null;
        }
    }

}
