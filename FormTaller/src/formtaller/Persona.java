/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formtaller;

/**
 *
 * @author adrian
 */
public class Persona {
    
    private String nombre;
    private String rut;
    private int edad;
    private String estadoCivil;
    private String ciudad;

    public Persona(String nombre, String rut, int edad, String estadoCivil, String ciudad) {
        this.nombre = nombre;
        this.rut = rut;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
        this.ciudad = ciudad;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", rut=" + rut + ", edad=" + edad + ", estadoCivil=" + estadoCivil + ", ciudad=" + ciudad + '}';
    }

    
}
