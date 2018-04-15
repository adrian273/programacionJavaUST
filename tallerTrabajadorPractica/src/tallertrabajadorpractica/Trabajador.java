
package tallertrabajadorpractica;

/**
 *
 * @author Adrian
 */
public class Trabajador {
    
    private String nombre;
    private int valorHora;
    private int  horasTrabajada;
    private int carga;
    private Cargo eC;

    public Trabajador(String nombre, int valorHora, int horasTrabajada, int carga, Cargo eC) {
        this.nombre = nombre;
        this.valorHora = valorHora;
        this.horasTrabajada = horasTrabajada;
        this.carga = carga;
        this.eC = eC;
    }

    public Trabajador() {
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabajada() {
        return horasTrabajada;
    }

    public void setHorasTrabajada(int horasTrabajada) {
        this.horasTrabajada = horasTrabajada;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public Cargo geteC() {
        return eC;
    }

    public void seteC(Cargo eC) {
        this.eC = eC;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "nombre=" + nombre + ", valorHora=" + valorHora + ", horasTrabajada=" + horasTrabajada + ", carga=" + carga + ", eC=" + eC + '}';
    }
    
    /**
     * 
     * @param vH {valor hora}
     * @param hT{horas trabajadas }
     * @param c {cargas}
     * @return sueldo total
     */
    public int calcularSueldo(int vH, int hT, int c) {
        
        int sueldoTotal = 0;
        if(hT > 45) {
            vH = (int) (vH * 1.5);
        }
        int sueldo = vH  * hT;
        
        if(c == 2 || c == 3) {
            sueldoTotal = (int) ((int) sueldo * 1.04);
        }
        else if(c == 4 || c == 5) {
            sueldoTotal = (int) ((int) sueldo * 1.07);
        }
        else if (c > 6){
            sueldoTotal = (int) ((int) sueldo * 1.1);
        }
        return sueldoTotal;
    }
    
}
