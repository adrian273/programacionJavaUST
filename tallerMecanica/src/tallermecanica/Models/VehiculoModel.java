
package tallermecanica.Models;

import java.sql.ResultSet;
import java.sql.SQLException;
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
        TODO agregar nuevo vehiculo
    */
    public void addNewVehiculo(String query) {
        c.actionRecord(query);
    }
    
    /**
     * TODO obtener los registros de las marcas de los automoviles
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
    
}
