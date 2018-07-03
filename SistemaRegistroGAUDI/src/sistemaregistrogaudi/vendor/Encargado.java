package sistemaregistrogaudi.vendor;

/**
 *
 * @author adrian
 */
public class Encargado extends Persona {

    private String profesion;
    private int yearIngreso;

    public Encargado(String profesion, int yearIngreso, String nombre, String apellido, String rut) {
        super(nombre, apellido, rut);
        this.profesion = profesion;
        this.yearIngreso = yearIngreso;
    }

    public Encargado() {
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getYearIngreso() {
        return yearIngreso;
    }

    public void setYearIngreso(int yearIngreso) {
        this.yearIngreso = yearIngreso;
    }

}
