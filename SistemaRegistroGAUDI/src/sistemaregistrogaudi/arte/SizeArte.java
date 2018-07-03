
package sistemaregistrogaudi.arte;

/**
 *
 * @author adrian
 */
public class SizeArte {
    
    private int ancho;
    private int alto;

    public SizeArte() {
    }

    public SizeArte(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "SizeArte{" + "ancho=" + ancho + ", alto=" + alto + '}';
    }
    
    
}
