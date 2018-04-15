
package tallertrabajadorpractica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kdr
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
        System.out.println("getNombre");
        String expResult = "adrian";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNombre method, of class Trabajador.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "adrian";
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getValorHora method, of class Trabajador.
     */
    @Test
    public void testGetValorHora() {
        System.out.println("getValorHora");
        int expResult = 500;
        int result = instance.getValorHora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setValorHora method, of class Trabajador.
     */
    @Test
    public void testSetValorHora() {
        System.out.println("setValorHora");
        int valorHora = 500;
        instance.setValorHora(valorHora);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getHorasTrabajada method, of class Trabajador.
     */
    @Test
    public void testGetHorasTrabajada() {
        System.out.println("getHorasTrabajada");
        int expResult = 2;
        int result = instance.getHorasTrabajada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setHorasTrabajada method, of class Trabajador.
     */
    @Test
    public void testSetHorasTrabajada() {
        System.out.println("setHorasTrabajada");
        int horasTrabajada = 2;
        instance.setHorasTrabajada(horasTrabajada);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCarga method, of class Trabajador.
     */
    @Test
    public void testGetCarga() {
        System.out.println("getCarga");
        int expResult = 6;
        int result = instance.getCarga();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setCarga method, of class Trabajador.
     */
    @Test
    public void testSetCarga() {
        System.out.println("setCarga");
        int carga = 6;
        instance.setCarga(carga);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of geteC method, of class Trabajador.
     */
    @Test
    public void testGeteC() {
        System.out.println("geteC");
        Cargo expResult = Cargo.APRENDIS;
        Cargo result = instance.geteC().APRENDIS;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of seteC method, of class Trabajador.
     */
    @Test
    public void testSeteC() {
        System.out.println("seteC");
        Cargo eC = Cargo.APRENDIS;
        instance.seteC(eC);
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
     * Test of calcularSueldo method, of class Trabajador.
     */
    @Test
    public void testCalcularSueldo() {
        System.out.println("calcularSueldo");
        int vH = 500;
        int hT = 2;
        int c = 8;
        int expResult = 1100;
        int result = instance.calcularSueldo(vH, hT, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

}
