
package biblioteca;

/**
 *
 * @author adrian
 */
public class Autor extends Persona {
   
    private Genero genero; 
   private String resena;
   
    public Autor(){}
    
    /**
     * 
     * @param genero
     * @param resena
     * @param nombre
     * @param fechaNacimiento 
     */
    public Autor(Genero genero, String resena, String nombre, String fechaNacimiento) {
        super(nombre, fechaNacimiento);
        this.genero = genero;
        this.resena = resena;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getResena() {
        return resena;
    }

    public void setResena(String resena) {
        this.resena = resena;
    }

}
