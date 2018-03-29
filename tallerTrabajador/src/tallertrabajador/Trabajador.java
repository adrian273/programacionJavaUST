package tallertrabajador;

/**
 *
 * @author Adrian Verdugo
 */
public class Trabajador {

    private String nombre;
    private int valorHora;
    private int horaTrabajada;
    private int carga;
    private EstadoCivil estadoCivil;

    public Trabajador(String nombre, int valorHora, int horaTrabajada, int carga, EstadoCivil estadoCivil) {
        this.nombre = nombre;
        this.valorHora = valorHora;
        this.horaTrabajada = horaTrabajada;
        this.carga = carga;
        this.estadoCivil = estadoCivil;
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

    public int getHoraTrabajada() {
        return horaTrabajada;
    }

    public void setHoraTrabajada(int horaTrabajada) {
        this.horaTrabajada = horaTrabajada;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "nombre=" + nombre + ", valorHora=" + valorHora + ", horaTrabajada=" + horaTrabajada + ", carga=" + carga + ", estadoCivil=" + estadoCivil + '}';
    }

    /**
     *
     * @param vH valor hora
     * @param hT horas trabajadas
     * @param c cargas
     * @return int sueldo total
     */
    public int calcularSueldoTotal(int vH, int hT, int c) {
        int sueldoTotal = 0;
        int sueldo = vH * hT;
        if (c > 1 && c < 3) {
            sueldoTotal = (int) (sueldo * 1.05);
        } else if (c >= 3 && c < 6) {
            sueldoTotal = (int) (sueldo * 1.08);
        } else {
            sueldoTotal = (int) (sueldo * 1.1);
        }

        return sueldoTotal;
    }

}
