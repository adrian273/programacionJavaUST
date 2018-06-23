package ejemplodatabase01;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author adrian
 */
public class Coneccion {

    /**
     * para la conecion
     */
    private Connection con;
    private ResultSet rs;
    private Statement instruct;

    private static final String hostName = "localhost";
    private static String port = "3306";
    private static String database = "ejemplo01";
    private static String user = "root";
    private static String password = "188915051k";

    public Coneccion() throws ClassNotFoundException {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://" + hostName + ":3306/" + database, user, password);
            System.out.println("Coneccion Exitosa");
            instruct = (Statement) con.createStatement();
        } catch (SQLException s) {
            System.out.println(s);
        }
    }

    public void ejecuta(String sql) {
        try {
            instruct.execute(sql);
        } catch (SQLException s) {
            System.out.println(s);
        }
    }
    
    public ResultSet consulta() throws SQLException {
        rs = instruct.executeQuery("SELECT * FROM alumnos");
        return rs;
    }
}