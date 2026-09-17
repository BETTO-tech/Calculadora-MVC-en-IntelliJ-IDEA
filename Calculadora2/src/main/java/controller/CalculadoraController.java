package controller;

import model.CalculadoraModel;
import view.CalculadoraView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraController {

    private final CalculadoraModel modelo;
    private final CalculadoraView vista;

    private double numero1;
    private String operador;
    private boolean nuevaEntrada = true;

    public CalculadoraController(
            CalculadoraModel modelo,
            CalculadoraView vista) {

        this.modelo = modelo;
        this.vista = vista;

        configurarEventos();
    }

    private void configurarEventos() {

        vista.getBtn0().addActionListener(e -> escribirNumero("0"));
        vista.getBtn1().addActionListener(e -> escribirNumero("1"));
        vista.getBtn2().addActionListener(e -> escribirNumero("2"));
        vista.getBtn3().addActionListener(e -> escribirNumero("3"));
        vista.getBtn4().addActionListener(e -> escribirNumero("4"));
        vista.getBtn5().addActionListener(e -> escribirNumero("5"));
        vista.getBtn6().addActionListener(e -> escribirNumero("6"));
        vista.getBtn7().addActionListener(e -> escribirNumero("7"));
        vista.getBtn8().addActionListener(e -> escribirNumero("8"));
        vista.getBtn9().addActionListener(e -> escribirNumero("9"));

        vista.getBtnSumar().addActionListener(
                e -> seleccionarOperacion("+")
        );

        vista.getBtnRestar().addActionListener(
                e -> seleccionarOperacion("-")
        );

        vista.getBtnMultiplicar().addActionListener(
                e -> seleccionarOperacion("*")
        );

        vista.getBtnDividir().addActionListener(
                e -> seleccionarOperacion("/")
        );

        vista.getBtnIgual().addActionListener(
                e -> calcularResultado()
        );

        vista.getBtnLimpiar().addActionListener(
                e -> limpiar()
        );
    }

    private void escribirNumero(String numero) {

        if (nuevaEntrada) {
            vista.getTxtPantalla().setText(numero);
            nuevaEntrada = false;
        } else {
            vista.getTxtPantalla().setText(
                    vista.getTxtPantalla().getText() + numero
            );
        }
    }

    private void seleccionarOperacion(String operador) {

        String texto = vista.getTxtPantalla().getText();

        if (texto.isEmpty()) {
            return;
        }

        numero1 = Double.parseDouble(texto);

        this.operador = operador;

        nuevaEntrada = true;
    }

    private void calcularResultado() {

        if (operador == null) {
            return;
        }

        String texto = vista.getTxtPantalla().getText();

        if (texto.isEmpty()) {
            return;
        }

        double numero2 = Double.parseDouble(texto);

        try {

            double resultado;

            switch (operador) {

                case "+":
                    resultado = modelo.sumar(numero1, numero2);
                    break;

                case "-":
                    resultado = modelo.restar(numero1, numero2);
                    break;

                case "*":
                    resultado = modelo.multiplicar(numero1, numero2);
                    break;

                case "/":
                    resultado = modelo.dividir(numero1, numero2);
                    break;

                default:
                    return;
            }

            vista.getTxtPantalla().setText(
                    String.valueOf(resultado)
            );

        } catch (ArithmeticException e) {

            vista.getTxtPantalla().setText("Error");
        }

        operador = null;
        nuevaEntrada = true;
    }

    private void limpiar() {

        vista.getTxtPantalla().setText("");

        numero1 = 0;
        operador = null;
        nuevaEntrada = true;
    }
}