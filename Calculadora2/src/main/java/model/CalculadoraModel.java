package model;

public class CalculadoraModel {

    // Suma dos números
    public double sumar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    // Resta dos números
    public double restar(double numero1, double numero2) {
        return numero1 - numero2;
    }

    // Multiplica dos números
    public double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }

    // Divide dos números
    public double dividir(double numero1, double numero2) {

        if (numero2 == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }

        return numero1 / numero2;
    }
}