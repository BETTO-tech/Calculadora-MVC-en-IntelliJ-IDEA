package controller;

import model.CalculadoraModel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import view.CalculadoraView;

import javax.swing.SwingUtilities;

import static org.junit.Assert.assertEquals;

public class CalculadoraControllerTest {

    private CalculadoraModel modelo;
    private CalculadoraView vista;
    private CalculadoraController controlador;

    @Before
    public void setUp() throws Exception {

        SwingUtilities.invokeAndWait(() -> {

            modelo = new CalculadoraModel();
            vista = new CalculadoraView();
            controlador = new CalculadoraController(modelo, vista);

        });
    }

    @After
    public void tearDown() throws Exception {

        SwingUtilities.invokeAndWait(() -> {
            vista.dispose();
        });
    }

    @Test
    public void testEscribirNumero() throws Exception {

        SwingUtilities.invokeAndWait(() -> {

            vista.getBtn1().doClick();
            vista.getBtn2().doClick();
            vista.getBtn3().doClick();

            assertEquals(
                    "123",
                    vista.getTxtPantalla().getText()
            );

        });
    }

    @Test
    public void testSumar() throws Exception {

        SwingUtilities.invokeAndWait(() -> {

            vista.getBtn1().doClick();
            vista.getBtn0().doClick();

            vista.getBtnSumar().doClick();

            vista.getBtn5().doClick();

            vista.getBtnIgual().doClick();

            assertEquals(
                    "15.0",
                    vista.getTxtPantalla().getText()
            );

        });
    }

    @Test
    public void testRestar() throws Exception {

        SwingUtilities.invokeAndWait(() -> {

            vista.getBtn9().doClick();

            vista.getBtnRestar().doClick();

            vista.getBtn4().doClick();

            vista.getBtnIgual().doClick();

            assertEquals(
                    "5.0",
                    vista.getTxtPantalla().getText()
            );

        });
    }

    @Test
    public void testMultiplicar() throws Exception {

        SwingUtilities.invokeAndWait(() -> {

            vista.getBtn6().doClick();

            vista.getBtnMultiplicar().doClick();

            vista.getBtn5().doClick();

            vista.getBtnIgual().doClick();

            assertEquals(
                    "30.0",
                    vista.getTxtPantalla().getText()
            );

        });
    }

    @Test
    public void testDividir() throws Exception {

        SwingUtilities.invokeAndWait(() -> {

            vista.getBtn8().doClick();

            vista.getBtnDividir().doClick();

            vista.getBtn2().doClick();

            vista.getBtnIgual().doClick();

            assertEquals(
                    "4.0",
                    vista.getTxtPantalla().getText()
            );

        });
    }

    @Test
    public void testDivisionEntreCero() throws Exception {

        SwingUtilities.invokeAndWait(() -> {

            vista.getBtn8().doClick();

            vista.getBtnDividir().doClick();

            vista.getBtn0().doClick();

            vista.getBtnIgual().doClick();

            assertEquals(
                    "Error",
                    vista.getTxtPantalla().getText()
            );

        });
    }

    @Test
    public void testLimpiarPantalla() throws Exception {

        SwingUtilities.invokeAndWait(() -> {

            vista.getBtn1().doClick();
            vista.getBtn2().doClick();
            vista.getBtn3().doClick();

            vista.getBtnLimpiar().doClick();

            assertEquals(
                    "",
                    vista.getTxtPantalla().getText()
            );

        });
    }
}
