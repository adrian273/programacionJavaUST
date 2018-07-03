
package sistemaregistrogaudi;

import sistemaregistrogaudi.arte.Arte;
import sistemaregistrogaudi.vendor.Sala;

/**
 *
 * @author adrianK
 */
public class FichaIngreso {
    private Sala sala;
    private Arte arte;

    public FichaIngreso(Sala sala, Arte arte) {
        this.sala = sala;
        this.arte = arte;
    }

    public FichaIngreso() {
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Arte getArte() {
        return arte;
    }

    public void setArte(Arte arte) {
        this.arte = arte;
    }

    @Override
    public String toString() {
        return "FichaIngreso{" + "sala=" + sala + ", arte=" + arte + '}';
    }
    
    
}
