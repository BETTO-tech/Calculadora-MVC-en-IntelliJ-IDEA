package view;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.*;

public class CalculadoraViewTest {

    private CalculadoraView vista;

    @Before
    public void setUp() throws Exception {

        SwingUtilities.invokeAndWait(() -> {
            vista = new CalculadoraView();
        });
    }

    @After
    public void tearDown() throws Exception {

        SwingUtilities.invokeAndWait(() -> {
            vista.dispose();
        });
    }

    @Test
    public void testVentanaCreada() {

        assertNotNull(vista);

        assertEquals(
                "Calculadora MVC",
                vista.getTitle()
        );
    }

    @Test
    public void testPantallaExiste() {

        assertNotNull(
                vista.getTxtPantalla()
        );
    }

    @Test
    public void testPantallaNoEditable() {

        assertFalse(
                vista.getTxtPantalla().isEditable()
        );
    }

    @Test
    public void testBotonesNumericosExisten() {

        assertNotNull(vista.getBtn0());
        assertNotNull(vista.getBtn1());
        assertNotNull(vista.getBtn2());
        assertNotNull(vista.getBtn3());
        assertNotNull(vista.getBtn4());
        assertNotNull(vista.getBtn5());
        assertNotNull(vista.getBtn6());
        assertNotNull(vista.getBtn7());
        assertNotNull(vista.getBtn8());
        assertNotNull(vista.getBtn9());
    }

    @Test
    public void testBotonesOperacionesExisten() {

        assertNotNull(vista.getBtnSumar());
        assertNotNull(vista.getBtnRestar());
        assertNotNull(vista.getBtnMultiplicar());
        assertNotNull(vista.getBtnDividir());
        assertNotNull(vista.getBtnIgual());
        assertNotNull(vista.getBtnLimpiar());
    }

    @Test
    public void testTextoBotonesNumericos() {

        assertEquals("0", vista.getBtn0().getText());
        assertEquals("1", vista.getBtn1().getText());
        assertEquals("2", vista.getBtn2().getText());
        assertEquals("3", vista.getBtn3().getText());
        assertEquals("4", vista.getBtn4().getText());
        assertEquals("5", vista.getBtn5().getText());
        assertEquals("6", vista.getBtn6().getText());
        assertEquals("7", vista.getBtn7().getText());
        assertEquals("8", vista.getBtn8().getText());
        assertEquals("9", vista.getBtn9().getText());
    }

    @Test
    public void testTextoBotonesOperaciones() {

        assertEquals("+", vista.getBtnSumar().getText());
        assertEquals("-", vista.getBtnRestar().getText());
        assertEquals("*", vista.getBtnMultiplicar().getText());
        assertEquals("/", vista.getBtnDividir().getText());
        assertEquals("=", vista.getBtnIgual().getText());
        assertEquals("C", vista.getBtnLimpiar().getText());
    }

    @Test
    public void testCierreVentana() {

        assertEquals(
                JFrame.EXIT_ON_CLOSE,
                vista.getDefaultCloseOperation()
        );
    }
}
