/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primera.semana;

/**
 *
 * @author cdani
 */
public class Condicionales {

    public static void main(String[] args) {

        //int numero = +15;
        //System.out.println(calcularValorAbsoluto(numero));
        //System.out.println("Resultado " + encuentraMaximo(11, 11));
        System.out.println("resultado " + encontrarVocalS('x'));
    }

    public static int calcularValorAbsoluto(int numero) {
        int valor = 0;
        if (numero >= 0) {
            valor = numero;
        } else {
            valor = -numero;
        }
        return valor;
    }

    public static String encuentraMaximo(int numero1, int numero2) {
        if (numero1 > numero2 || numero1 == numero2) {
            return "Numero1 es mayor " + numero1;
        } else if (numero2 > numero1) {
            return "Numero2 es mayor " + numero2;
        } else {
            return "Iguales";
        }
    }

    public static boolean encontrarVocal(char letra) {
        boolean esVocal = false;
        if (letra == 'a') {
            esVocal = true;
        } else if (letra == 'e') {
            esVocal = true;
        } else if (letra == 'i') {
            esVocal = true;
        } else if (letra == 'o') {
            esVocal = true;
        } else if (letra == 'u') {
            esVocal = true;
        } else {
            return esVocal;
        }
        return esVocal;
    }

    public static boolean encontrarVocalS(char letra) {
        boolean esVocal = false;

        switch (letra) {
            case 'a':
                esVocal = true;
                break;
            case 'e':
                esVocal = true;
                break;
            case 'i':
                esVocal = true;
                break;
            case 'o':
                esVocal = true;
                break;
            case 'u':
                esVocal = true;
                break;
        }

        return esVocal;
    }

}
