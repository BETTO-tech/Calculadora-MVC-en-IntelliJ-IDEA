package view;

import javax.swing.*;
import java.awt.*;

public class CalculadoraView extends JFrame {

    private JTextField txtPantalla;

    private JButton btn0;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;

    private JButton btnSumar;
    private JButton btnRestar;
    private JButton btnMultiplicar;
    private JButton btnDividir;
    private JButton btnIgual;
    private JButton btnLimpiar;

    public CalculadoraView() {

        setTitle("Calculadora MVC");

        setSize(350, 450);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        setResizable(true);

        crearComponentes();
    }

    private void crearComponentes() {

        txtPantalla = new JTextField();

        txtPantalla.setEditable(false);
        txtPantalla.setHorizontalAlignment(JTextField.RIGHT);
        txtPantalla.setFont(new Font("Arial", Font.BOLD, 24));

        btn0 = new JButton("0");
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");

        btnSumar = new JButton("+");
        btnRestar = new JButton("-");
        btnMultiplicar = new JButton("*");
        btnDividir = new JButton("/");
        btnIgual = new JButton("=");
        btnLimpiar = new JButton("C");

        JPanel panelBotones = new JPanel();

        panelBotones.setLayout(new GridLayout(4, 4, 5, 5));

        panelBotones.add(btn7);
        panelBotones.add(btn8);
        panelBotones.add(btn9);
        panelBotones.add(btnDividir);

        panelBotones.add(btn4);
        panelBotones.add(btn5);
        panelBotones.add(btn6);
        panelBotones.add(btnMultiplicar);

        panelBotones.add(btn1);
        panelBotones.add(btn2);
        panelBotones.add(btn3);
        panelBotones.add(btnRestar);

        panelBotones.add(btn0);
        panelBotones.add(btnLimpiar);
        panelBotones.add(btnIgual);
        panelBotones.add(btnSumar);

        setLayout(new BorderLayout(10, 10));

        add(txtPantalla, BorderLayout.NORTH);
        add(panelBotones, BorderLayout.CENTER);
    }

    public JTextField getTxtPantalla() {
        return txtPantalla;
    }

    public JButton getBtn0() {
        return btn0;
    }

    public JButton getBtn1() {
        return btn1;
    }

    public JButton getBtn2() {
        return btn2;
    }

    public JButton getBtn3() {
        return btn3;
    }

    public JButton getBtn4() {
        return btn4;
    }

    public JButton getBtn5() {
        return btn5;
    }

    public JButton getBtn6() {
        return btn6;
    }

    public JButton getBtn7() {
        return btn7;
    }

    public JButton getBtn8() {
        return btn8;
    }

    public JButton getBtn9() {
        return btn9;
    }

    public JButton getBtnSumar() {
        return btnSumar;
    }

    public JButton getBtnRestar() {
        return btnRestar;
    }

    public JButton getBtnMultiplicar() {
        return btnMultiplicar;
    }

    public JButton getBtnDividir() {
        return btnDividir;
    }

    public JButton getBtnIgual() {
        return btnIgual;
    }

    public JButton getBtnLimpiar() {
        return btnLimpiar;
    }
}

