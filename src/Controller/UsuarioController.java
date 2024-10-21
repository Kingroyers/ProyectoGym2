package Controller;

import static java.awt.image.ImageObserver.ERROR;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Model.conexionp;
import view.MENU;

public class UsuarioController {
   Connection conn;
   conexionp cn = new conexionp();
   PreparedStatement ps;
   ResultSet rs; 
public void ConsultarRegist(String codigoQR) throws SQLException{
    
    PreparedStatement stmt = conn.prepareStatement("SELECT * FROM usuario WHERE id = ?");
    stmt.setString(1, codigoQR);
    rs = stmt.executeQuery();
    
    if(rs.next()){
        
        conn.prepareStatement("SELECT Nombre FROM usuario WHERE id = ?");
        stmt.setString(1, codigoQR);
        rs = stmt.executeQuery();
        
        if (rs.next()) {
            
            String Nombre = rs.getString("Nombre"); // recordar poner logica de usuario registrado
            
            
            if ("Andres".equalsIgnoreCase(Nombre)){
                
                JOptionPane.showMessageDialog(null," BIENVENIDO ",
                    "titulo", JOptionPane.PLAIN_MESSAGE, icono("/img/MdiDumbbell.png", 40, 40));
            }else{
                JOptionPane.showMessageDialog(null, "INGRESO NO VALIDO",
                    "MESAJE DEL SISTEMA",ERROR);
            }
            
        }
        
    }else{
        JOptionPane.showMessageDialog(null, "USUARIO NO ESTÁ REGISTRADO",
                "MENSAJE DEL SISTEMA",ERROR);
    }return;
    
}
 public Icon icono(String path, int width, int heigth){
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().getScaledInstance(width, heigth, java.awt.Image.SCALE_SMOOTH));
        return img;
    }

}
