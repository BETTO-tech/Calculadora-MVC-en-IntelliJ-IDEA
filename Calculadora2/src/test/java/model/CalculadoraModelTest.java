package model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraModelTest {

    @Test
    public void testSumar() {

        CalculadoraModel calculadora = new CalculadoraModel();

        double resultado = calculadora.sumar(10, 5);

        assertEquals(15.0, resultado, 0.001);
    }

    @Test
    public void testRestar() {

        CalculadoraModel calculadora = new CalculadoraModel();

        double resultado = calculadora.restar(10, 5);

        assertEquals(5.0, resultado, 0.001);
    }

    @Test
    public void testMultiplicar() {

        CalculadoraModel calculadora = new CalculadoraModel();

        double resultado = calculadora.multiplicar(10, 5);

        assertEquals(50.0, resultado, 0.001);
    }

    @Test
    public void testDividir() {

        CalculadoraModel calculadora = new CalculadoraModel();

        double resultado = calculadora.dividir(10, 5);

        assertEquals(2.0, resultado, 0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDividirEntreCero() {

        CalculadoraModel calculadora = new CalculadoraModel();

        calculadora.dividir(10, 0);
    }
}