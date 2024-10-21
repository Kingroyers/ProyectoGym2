package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;


public class conexionp {
   
   Connection conn = null; 
 private String url = "jdbc:mysql://localhost:3306/pce"; // Cambia por el nombre de tu base de datos
 private String user = "root"; // Usuario de MySQL
 private String password = ""; // Contraseña de MySQL
 
   
public Connection getConnection() {
        
    try {
       
       conn = DriverManager.getConnection(url, "root", "");
       return conn;
        
    } catch (SQLException e) {
        
     System.out.println(e.toString()); 
      e.printStackTrace();
    }
       return null;
    
}
 public void closeConnection() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
}


