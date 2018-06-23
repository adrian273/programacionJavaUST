/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivodeobjetos;

import java.io.Serializable;
import java.util.logging.Logger;

/**
 *
 * @author adrian
 */
public class Integrantes implements Serializable {
    private String nombre;
    private int edad;

    public Integrantes() {
    }

    public Integrantes(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Integrantes{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
    
}
