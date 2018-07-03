/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallermecanica.Models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import tallermecanica.Coneccion;

/**
 *
 * @author adrian
 */
public class UsuarioModel {

    private Coneccion c;
    private ResultSet rs;

    public UsuarioModel() throws ClassNotFoundException {
        this.c = new Coneccion();
    }
    
    /**
     * 
     * @return registros de los usuarios
     * @throws SQLException 
     */
    public ResultSet viewUser() throws SQLException {
        String query = "SELECT * FROM usuarios";
        rs = c.getInstruct().executeQuery(query);
        return rs;
    }
    
    /**
     * TODO Agregar nuevo usuario;;
     * @param n nombre
     * @param e email
     * @param p password
     */
    public void addNewUser(String n, String e, String p) {
        Date d = new Date();
        DateFormat df = new SimpleDateFormat("yy-MM-dd ");
        String query = "INSERT INTO usuarios (nombreUsuario, emailUsuario, passwordUsuario, fechaCreacionUsuario)"
                + "VALUES ('"
                + n + "','"
                + e + "', '"
                + p + "','"
                + df.format(d) + "'); ";
        c.actionRecord(query);
    }
    
    /**
     * TODO eliminar los datos del usuario
     * @param patente 
     */
    public void deleteUser(int ident) {
        String query;
        query = "DELETE FROM usuarios WHERE idUsuario = '"
                + ident +"';";
        c.actionRecord(query);
    }
    
    /**
     * TODO editar datos de los usuarios
     * @param id
     * @param nombre
     * @param email 
     */
    public void updateUser(int id, String nombre, String email) {
        String query = "UPDATE usuarios SET nombreUsuario = '"
                + nombre + "', emailUsuario = '"
                + email + "' WHERE idUsuario = '"
                + id +"'";
        c.actionRecord(query);
    }
    
}
