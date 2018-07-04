
package sistemaregistrogaudi.vendor;

import java.util.Objects;

/**
 *
 * @author adrian
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

    public String getNombreSala() {
        return nombreSala;
    }

    public void setNombreSala(String nombreSala) {
        this.nombreSala = nombreSala;
    }

    public int getCantidadLampara() {
        return cantidadLampara;
    }

    public void setCantidadLampara(int cantidadLampara) {
        this.cantidadLampara = cantidadLampara;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public String getCierreCentralizado() {
        return cierreCentralizado;
    }

    public void setCierreCentralizado(String cierreCentralizado) {
        this.cierreCentralizado = cierreCentralizado;
    }

    public String getAlarmaIncendio() {
        return alarmaIncendio;
    }

    public void setAlarmaIncendio(String alarmaIncendio) {
        this.alarmaIncendio = alarmaIncendio;
    }

    public Encargado getEncargado() {
        return encargado;
    }

    public void setEncargado(Encargado encargado) {
        this.encargado = encargado;
    }

    @Override
    public String toString() {
        return "Sala{" + "nombreSala=" + nombreSala + ", cantidadLampara=" + cantidadLampara + ", temperatura=" + temperatura + ", cierreCentralizado=" + cierreCentralizado + ", alarmaIncendio=" + alarmaIncendio + ", encargado=" + encargado + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nombreSala);
        hash = 79 * hash + this.cantidadLampara;
        hash = 79 * hash + this.temperatura;
        hash = 79 * hash + Objects.hashCode(this.cierreCentralizado);
        hash = 79 * hash + Objects.hashCode(this.alarmaIncendio);
        hash = 79 * hash + Objects.hashCode(this.encargado);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sala other = (Sala) obj;
        return true;
    }
   
    
}
