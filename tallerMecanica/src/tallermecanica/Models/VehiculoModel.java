
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
public class VehiculoModel {
    
    private Coneccion c;
    private ResultSet rs;
    
    public VehiculoModel() throws ClassNotFoundException {
        c = new Coneccion();
    }
    
    /**
     * 
     * @param patente
     * @param marcas
     * @param modelo
     * @param color
     * @param year
     * @param rut
     * TODO Agregar nuevos vehiculos al sistema
     */
    public void addNewVehiculo(String patente, String marcas, String modelo, String color, int year, String rut) {
        Date d = new Date();
        DateFormat df = new SimpleDateFormat("yy-MM-dd");
        String query = "INSERT INTO vehiculos (patenteVehiculo, marcas_idMarca, modelo, color, yearVehiculo, fechaRegistroVehiculo, clientes_rutCliente)"
                + "VALUES ('"
                + patente + "','"
                + 1 + "', '"
                + modelo + "', '"
                + color + "','"
                + year + "', '"
                + df.format(d) + "', '"
                + rut + "'); ";
        c.actionRecord(query);
    }
    
    /**
     * TODO obtener los registros de las marcas de los automoviles
     * @return marcas
     * @throws java.sql.SQLException
     */
    public ResultSet viewMarca() throws SQLException {
        String query = "SELECT * FROM marcas";
        rs = c.getInstruct().executeQuery(query);
        return rs;
    }
    
    /**
     * 
     * @return registros de los vehiculos
     * @throws SQLException 
     */
    public ResultSet viewVehiculo() throws SQLException {
        String query = "SELECT * FROM vehiculos, marcas, clientes "
                + "WHERE marcas.idMarca = vehiculos.marcas_idMarca "
                + "AND clientes.rutCliente = vehiculos.clientes_rutCliente";
        rs = c.getInstruct().executeQuery(query);
        return rs;
    }
    
    /**
     * 
     * @param patente del vehiculo
     * @return false si no esta la patente;;
     * @throws SQLException 
     */
    public boolean verificPatente(String patente) throws SQLException {
        String query = "SELECT patenteVehiculo FROM vehiculos "
                + "WHERE patenteVehiculo = '"
                + patente + "';";
        rs = c.getInstruct().executeQuery(query);
        if(rs.next()) {
            rs.beforeFirst();
            return true;
        }
        return false;
    }
    
}
