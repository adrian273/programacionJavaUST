package sistemaregistrogaudi.vendor;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.profesion);
        hash = 67 * hash + this.yearIngreso;
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
        final Encargado other = (Encargado) obj;
        if (this.yearIngreso != other.yearIngreso) {
            return false;
        }
        if (!Objects.equals(this.profesion, other.profesion)) {
            return false;
        }
        return true;
    }

    
}
