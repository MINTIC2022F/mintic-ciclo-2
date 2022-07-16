package semana.cuatro;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {

    /**
     * Test of sumar method, of class Calculadora.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        double num1 = 2.5;
        double num2 = 6.1;
        Calculadora calculadora = new Calculadora();
        double esperado = 8.6;
        double actual = calculadora.sumar(num1, num2);
        assertEquals(esperado, actual, 0.0);

    }

    @Test
    public void testRestar() {
        System.out.println("restar");
        double num1 = 3.7;
        double num2 = 0.6;
        Calculadora calculadora = new Calculadora();
        double esperado = 3.1;
        double actual = calculadora.restar(num1, num2);
        assertEquals(esperado, actual, 0.0);

    }

    @Test
    public void testMultiplicar() {
        System.out.println("multiplicacion");
        double num1 = 3.0;
        double num2 = 2.0;
        Calculadora calculadora = new Calculadora();
        double esperado = 6.0;
        double actual = calculadora.multiplicar(num1, num2);
        assertEquals(esperado, actual, 0.0);
    }

    @Test
    public void testDividir() {
        System.out.println("dividir");
        double num1 = 3.0;
        double num2 = 2.0;
        Calculadora calculadora = new Calculadora();
        double esperado = 1.5;
        double actual = calculadora.dividir(num1, num2);
        assertEquals(esperado, actual, 0.0);

    }

    @Test
    public void testPotencia() {
        System.out.println("potencia");
        double num1 = 3.0;
        double num2 = 2.0;
        Calculadora calculadora = new Calculadora();
        double esperado = 9.0;
        double actual = calculadora.obtenerPotencia(num1, num2);
        assertEquals(esperado, actual, 0.0);

    }

    @Test
    public void testPotenciaNull() {
        System.out.println("potencia null");
        double num1 = 2.0;
        double num2 = 3.0;
        Calculadora calculadora = new Calculadora();
        Double actual = calculadora.obtenerPotencia(num1, num2);
        assertNull(actual);

    }

}
