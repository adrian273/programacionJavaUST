
package sistemaregistrogaudi.vendor;

/**
 *
 * @author adrian kdrs
 */
public class Sala {
    
    private String nombreSala;
    private int cantidadLampara;
    private int temperatura;
    private String cierreCentralizado;
    private String alarmaIncendio;
    private Encargado encargado;
    
    public Sala() {}
    
    public Sala(String nombreSala, int cantidadLampara, int temperatura, String cierreCentralizado, String alarmaIncendio, Encargado encargado) {
        this.nombreSala = nombreSala;
        this.cantidadLampara = cantidadLampara;
        this.temperatura = temperatura;
        this.cierreCentralizado = cierreCentralizado;
        this.alarmaIncendio = alarmaIncendio;
        this.encargado = encargado;
    }
   
    
}
