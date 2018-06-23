package tallermecanica;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author adrian
 */
public class Coneccion {

    private Connection link;
    private ResultSet rs;
    private Statement instruct;

    private static final String hostName = "localhost";
    private static final String port = "3306";
    private static final String database = "taller_mecanico";
    private static final String user = "root";
    private static String password = "188915051k";

    public Coneccion() throws ClassNotFoundException {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            link = (Connection) DriverManager.getConnection("jdbc:mysql://" + hostName + ":3306/" + database, user, password);
            instruct = (Statement) link.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * Executar Querys de tipo insert, update, delete
     *
     * @param query
     */
    public void actionRecord(String query) {
        try {
            instruct.execute(query);
        } catch (SQLException s) {
            System.out.println(s);
        }
    }

    /**
     *
     * @return datos de los clientes
     * @throws SQLException
     */
    public ResultSet viewClientes() throws SQLException {
        String query = "SELECT * FROM clientes ORDER BY fechaCreacionCliente DESC";
        rs = instruct.executeQuery(query);
        return rs;
    }

    /**
     *
     * @param rut
     * @return rut cliente si es que existe en la base de datos
     */
    public ResultSet verificarRutExistente(String rut) throws SQLException {
        String query = "SELECT rutCliente FROM clientes WHERE rutCliente = '"
                + rut + " ';";
        rs = instruct.executeQuery(query);
        return rs;
    }
    
    public ResultSet viewVehiculo() throws SQLException {
        String query = "SELECT * FROM vehiculos, marcas, clientes "
                + "WHERE marcas.idMarca = vehiculos.marcas_idMarca "
                + "AND clientes.rutCliente = vehiculos.clientes_rutCliente";
        rs = instruct.executeQuery(query);
        return rs;
    }
}
