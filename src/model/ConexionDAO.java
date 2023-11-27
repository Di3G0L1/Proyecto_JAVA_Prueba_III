
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Diego - Seba
 */
public class ConexionDAO {
    
    private static Connection conn;
    String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
    String usuario = "EJERCICIO";
    String password = "EJERCICIO";

    private ConexionDAO() throws SQLException {
        DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
        conn = DriverManager.getConnection(url, usuario, password);
    }

    public static Connection getConnection() throws SQLException {
        if (conn == null) {
            new ConexionDAO();
        }
        return conn;
    }
}
