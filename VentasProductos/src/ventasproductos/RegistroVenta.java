package ventasproductos;

/**
 *
 * @author adrian
 */
public class RegistroVenta {
    private int cantidad;
    private Productos pro;
    private boolean estadoVenta;
    public RegistroVenta(int cantidad, Productos pro, boolean estadoVenta) {
        this.cantidad = cantidad;
        this.pro = pro;
        this.estadoVenta = estadoVenta;
    }

    public RegistroVenta() {
    }

    public boolean isEstadoVenta() {
        return estadoVenta;
    }

    public void setEstadoVenta(boolean estadoVenta) {
        this.estadoVenta = estadoVenta;
    }
    
    
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Productos getPro() {
        return pro;
    }

    public void setPro(Productos pro) {
        this.pro = pro;
    }
    
}
