package trabajadores;
public class jefe extends empleado
{
   private String cargo;
   private int num_of;
   private int anexo;
   private String nom_depto;
   private int sueldo;
   private int bono;

    public String getCargo() {
        return cargo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getBono() {
        return bono;
    }

    public void setBono(int bono) {
        this.bono = bono;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getNum_of() {
        return num_of;
    }

    public void setNum_of(int num_of) {
        this.num_of = num_of;
    }

    public int getAnexo() {
        return anexo;
    }

    public void setAnexo(int anexo) {
        this.anexo = anexo;
    }

    public String getNom_depto() {
        return nom_depto;
    }

    public void setNom_depto(String nom_depto) {
        this.nom_depto = nom_depto;
    }
    
    public void ingresos(String cargo, int num_of, int anexo, String nom_depto, String nombre, String apellido, int edad, String rut, int sueldo, int bono)
    {
        super.ingreso(nombre,apellido,rut,edad);
        setCargo(cargo);
        setNum_of(num_of);
        setAnexo(anexo);
        setNom_depto(nom_depto);
        setSueldo(sueldo);
        setBono(bono);
    }  
}
