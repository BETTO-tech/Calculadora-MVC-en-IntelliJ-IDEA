package app;

import controller.CalculadoraController;
import model.CalculadoraModel;
import view.CalculadoraView;

public class Main {

    public static void main(String[] args) {

        CalculadoraModel modelo =
                new CalculadoraModel();

        CalculadoraView vista =
                new CalculadoraView();

        CalculadoraController controlador =
                new CalculadoraController(modelo, vista);

        vista.setVisible(true);
    }
}