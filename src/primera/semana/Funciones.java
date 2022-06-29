package primera.semana;

import java.util.Scanner;


public class Funciones {

    public static double calcularPotencia(double numero, int potencia) {
        return Math.pow(numero, potencia);
    }

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("Digite la base: ");
        int base = lector.nextInt();
        System.out.println("Digite la altura: ");
        int altura = lector.nextInt();
        double resultado = calcularAreaTriangulo(base, altura);
        System.out.println("resultado " + resultado);

    }

    public static void calcularAreaRectagulo(int base, int altura) {
        int area = 0;
        area = base * altura;
        System.out.println("area= " + area);
    }

    public static double calcularAreaTriangulo(int base, int altura) {
        double area = 0.0;
        area = base * altura / 2;
        return area;
    }

}
