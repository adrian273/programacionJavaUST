package ventasproductos;

/**
 *
 * @author adrian
 */
public class Productos {
    
    private String nombre;
    private FamiliaProducto fp;
    private String codigo;
    private int costo;

    public Productos(String nombre, FamiliaProducto fp, String codigo, int costo) {
        this.nombre = nombre;
        this.fp = fp;
        this.codigo = codigo;
        this.costo = costo;
    }

    public Productos() {
    }

    public Productos(String nombre, String codigo, int costo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.costo = costo;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public FamiliaProducto getFp() {
        return fp;
    }

    public void setFp(FamiliaProducto fp) {
        this.fp = fp;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Productos{" + "nombre=" + nombre + ", fp=" + fp + ", codigo=" + codigo + ", costo=" + costo + '}';
    }
    
    
}
