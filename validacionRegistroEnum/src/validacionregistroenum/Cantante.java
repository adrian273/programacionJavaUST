package validacionregistroenum;

/**
 *
 * @author Adrian
 */
public class Cantante {

    private String nombre;
    private String nacionalidad;
    private int edad;

    /**
     * @var carga : numero de hijos
     */
    private int carga;

    GeneroMusicalData gM;

    public Cantante(String nombre, String nacionalidad, int edad, GeneroMusicalData gM, int carga) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.gM = gM;
        this.carga = carga;
    }

    public Cantante() {
    }

    /**
     *
     * @return nombre del cantante
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre del cantante
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return nacionalidad de cantante
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     *
     * @param nacionalidad de cantante
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     *
     * @return edad de cantante
     */
    public int getEdad() {
        return edad;
    }

    /**
     *
     * @param edad de edad de cantante
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     *
     * @return genero musical [ENUM]
     */
    public GeneroMusicalData getgM() {
        return gM;
    }

    /**
     *
     * @param gM genero muscial tipo Enum
     */
    public void setgM(GeneroMusicalData gM) {
        this.gM = gM;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    

}
