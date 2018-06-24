
package tallermecanica.Models;

import java.sql.ResultSet;
import java.sql.SQLException;
import tallermecanica.Coneccion;

/**
 *
 * @author adrian
 * @since 24-06-2018
 */
public class RegistroModel {
    Coneccion c;

    public RegistroModel() throws ClassNotFoundException {
        c = new Coneccion();
    }
    
    /**
     * 
     * @return datos de los regitros
     * @throws SQLException 
     */
    public ResultSet dataRegistro() throws SQLException {
        String query = "SELECT * FROM registros, clientes, vehiculos "
                + "WHERE patenteVehiculo = vehiculos_patenteVehiculo AND rutCliente = clientes_rutCliente;";
        ResultSet rs = c.getInstruct().executeQuery(query);
        return rs;
    }
    
    
}
