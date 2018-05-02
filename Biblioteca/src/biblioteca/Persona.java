package biblioteca;
/**
 *
 * @author adrian
 */
public abstract class Persona {

    private String nombre;
    private String fechaNacimiento;

    public Persona() {}
    /**
     * 
     * @param nombre
     * @param fechaNacimiento 
     */
    public Persona(String nombre, String fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
}
