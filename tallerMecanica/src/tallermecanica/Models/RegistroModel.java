
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
                + "WHERE patenteVehiculo = vehiculos_patenteVehiculo AND rutCliente = clientes_rutCliente "
                + "ORDER BY fechaRegistro DESC;";
        ResultSet rs = c.getInstruct().executeQuery(query);
        return rs;
    }
    
    /**
     * 
     * @param des descripcion del problema mecanico
     * @param costo precio de la reparacion
     * @param patente 
     */
    public void addNewRegistro(String des, int costo, String patente)  {
        Date fecha = new Date();
        DateFormat sf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
        String query = "INSERT INTO registros (fechaRegistro, descripcionRegistro, totalCobroRegistro, vehiculos_patenteVehiculo)"
                + "VALUES ( '"
                + sf.format(fecha) +"', '"
                + des + "', "
                + costo + ", '"
                + patente + "'); ";
        c.actionRecord(query);
    }
    
    /**
     * 
     * @param ident identificador del tegostro seleccionado a borrar
     */
    public void deleteRegistro(int ident) {
        String query = "DELETE FROM registros"
                + " WHERE idRegistro = "
                + ident +";";
        c.actionRecord(query);
    }
    
}
