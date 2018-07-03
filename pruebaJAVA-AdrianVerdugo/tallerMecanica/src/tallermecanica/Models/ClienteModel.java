package tallermecanica.Models;


import java.sql.ResultSet;
import java.sql.SQLException;
import tallermecanica.Coneccion;


/**
 *
 * @author adrian
 */
public class ClienteModel {
    
    private Coneccion c;
    ResultSet rs;
    
    public ClienteModel() throws ClassNotFoundException {
        c = new Coneccion();
    }
        
    /**
     * TODO agregar nuevo cliente
     * @param q query consulta agregada
     */
    public void addNewClient(String q) {
        c.actionRecord(q);
    }
    
    /**
     *
     * @return datos de los clientes
     * @throws SQLException
     */
    public ResultSet viewClientes() throws SQLException {
        String query = "SELECT * FROM clientes ORDER BY fechaCreacionCliente DESC";
        rs = c.getInstruct().executeQuery(query);
        return rs;
    }

    /**
     *
     * @param rut
     * @return rut cliente si es que existe en la base de datos
     */
    public ResultSet verificarRutExistente(String rut) throws SQLException {
        String query = "SELECT * FROM clientes WHERE rutCliente = '"
                + rut + " ';";
        rs = c.getInstruct().executeQuery(query);
        return rs;
    }
    
}
