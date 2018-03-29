package trabajadores;
public class empleado
{
    private String nombre;
    private String apellido;
    private int edad;
    private String rut;
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
    public void ingreso(String nom, String ape, String rutt, int ed)
    {
       setNombre(nom);
       setEdad(ed);
       setApellido(ape);
       setRut(rutt);
    }
}
