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
    private static String password = "";

    public Coneccion() throws ClassNotFoundException {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            link = (Connection) DriverManager.getConnection("jdbc:mysql://" + hostName + ":3306/" + database, user, password);
            instruct = (Statement) link.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public Connection getLink() {
        return link;
    }

    public void setLink(Connection link) {
        this.link = link;
    }

    public Statement getInstruct() {
        return instruct;
    }

    public void setInstruct(Statement instruct) {
        this.instruct = instruct;
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

    
}
