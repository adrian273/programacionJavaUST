package sistemaregistrogaudi.arte;

import sistemaregistrogaudi.vendor.Persona;

/**
 *
 * @author adrian
 */
public class Autor extends Persona {
    
    private String nacional;

    public Autor() {
    }

    public Autor(String nacional, String nombre, String apellido, String rut) {
        super(nombre, apellido, rut);
        this.nacional = nacional;
    }

    public String getNacional() {
        return nacional;
    }

    public void setNacional(String nacional) {
        this.nacional = nacional;
    }

    @Override
    public String toString() {
        return "Autor{" + "nacional=" + nacional + '}';
    }
    
    
    
}
