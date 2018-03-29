
package tallertrabajador;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adrian Verdugo
 */
public class TrabajadorTest {

    static Trabajador instance;

    public TrabajadorTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        instance = new Trabajador();
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getNombre method, of class Trabajador.
     */
    @Test
    public void testGetNombre() {
        String expResult = "Adrian";
        System.out.println("getNombre: " + expResult);
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombre method, of class Trabajador.
     */
    @Test
    public void testSetNombre() {
        String nombre = "Adrian";
        System.out.println("setNombre: " + nombre);
        instance.setNombre(nombre);
    }

    /**
     * Test of getValorHora method, of class Trabajador.
     */
    @Test
    public void testGetValorHora() {
        int expResult = 1000;
        System.out.println("getValorHora: " + expResult);
        int result = instance.getValorHora();
        assertEquals(expResult, result);
    }

    /**
     * Test of setValorHora method, of class Trabajador.
     */
    @Test
    public void testSetValorHora() {
        int valorHora = 1000;
        System.out.println("setValorHora: " + valorHora);
        instance.setValorHora(valorHora);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getHoraTrabajada method, of class Trabajador.
     */
    @Test
    public void testGetHoraTrabajada() {
         int expResult = 5;
        System.out.println("getHoraTrabajada: " + expResult);
        int result = instance.getHoraTrabajada();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHoraTrabajada method, of class Trabajador.
     */
    @Test
    public void testSetHoraTrabajada() {
        int horaTrabajada = 5;
        System.out.println("setHoraTrabajada: " + horaTrabajada);
        instance.setHoraTrabajada(horaTrabajada);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCarga method, of class Trabajador.
     */
    @Test
    public void testGetCarga() {
        int expResult = 4;
        System.out.println("getCarga: " + expResult);
        int result = instance.getCarga();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setCarga method, of class Trabajador.
     */
    @Test
    public void testSetCarga() {
        int carga = 4;
        System.out.println("setCarga: " + carga);
        instance.setCarga(carga);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getEstadoCivil method, of class Trabajador.
     */
    @Test
    public void testGetEstadoCivil() {
        EstadoCivil expResult = EstadoCivil.CASADO;
        System.out.println("getEstadoCivil: " + expResult.name());
        EstadoCivil result = instance.getEstadoCivil();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setEstadoCivil method, of class Trabajador.
     */
    @Test
    public void testSetEstadoCivil() {
        EstadoCivil estadoCivil = EstadoCivil.CASADO;
        System.out.println("setEstadoCivil: " + estadoCivil.name());
        instance.setEstadoCivil(estadoCivil);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toString method, of class Trabajador.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of calcularSueldoTotal method, of class Trabajador.
     */
    @Test
    public void testCalcularSueldoTotal() {
        int vH = 500;
        int hT = 2;
        int c = 9;
        int expResult = 1100;
        int result = instance.calcularSueldoTotal(vH, hT, c);
        System.out.println("calcularSueldoTotal: " + result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

}
