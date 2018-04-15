/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase11abril;

/**
 *
 * @author kdr
 */
public class Persona {
    
    private String nombre;
    private String email;
    private String ciudad;
    private String estadoCivil;
    boolean mayorEdad;
    boolean licencia;
    public Persona() {
    }

    public Persona(String nombre, String email, String ciudad, String estadoCivil, boolean mayorEdad, boolean licencia) {
        this.nombre = nombre;
        this.email = email;
        this.ciudad = ciudad;
        this.estadoCivil = estadoCivil;
        this.mayorEdad = mayorEdad;
        this.licencia = licencia;
    }

  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public boolean isMayorEdad() {
        return mayorEdad;
    }

    public void setMayorEdad(boolean mayorEdad) {
        this.mayorEdad = mayorEdad;
    }

    public boolean isLicencia() {
        return licencia;
    }

    public void setLicencia(boolean licencia) {
        this.licencia = licencia;
    }
    
    

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", email=" + email + ", ciudad=" + ciudad + '}';
    }
    
    
    
}
