package trabajadores;
public class trabajador extends empleado
{
    private String n_estacion;
    private String seccion;
    private String rango;
    private int valor_hora;
    private int cantidad_horas;

    public int getValor_hora() {
        return valor_hora;
    }

    public void setValor_hora(int valor_hora) {
        this.valor_hora = valor_hora;
    }

    public int getCantidad_horas() {
        return cantidad_horas;
    }

    public void setCantidad_horas(int cantidad_horas) {
        this.cantidad_horas = cantidad_horas;
    }

    public String getN_estacion() {
        return n_estacion;
    }

    public void setN_estacion(String n_estacion) {
        this.n_estacion = n_estacion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }
    
    public void ingresos(String n_estacion,String seccion, String rango, String nombre, String apellido, int edad, String rut,int valor_hora, int cantidad_horas)
    {
        super.ingreso(nombre,apellido,rut,edad);
        setN_estacion(n_estacion);
        setSeccion(seccion);
        setRango(rango);
        setValor_hora(valor_hora);
        setCantidad_horas(cantidad_horas);
    }
}
