package view;

import Model.conexionp;
import Controller.UsuarioController;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import java.awt.Dimension;
import java.util.concurrent.ThreadFactory;
import com.github.sarxos.webcam.WebcamResolution;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import  Model.conexionp;

/*x

/**
 *
 * @author Antonio
 */

public class ReadQR extends javax.swing.JFrame implements Runnable, ThreadFactory {
    
   Connection conn;
    conexionp cn = new conexionp();
   PreparedStatement ps;
   ResultSet rs; 
    
    private WebcamPanel panel = null;
    private Webcam webcam = null;
    
    private static final long serialVersionUID = 6441489157408381878L;
    private Executor executor = Executors.newSingleThreadExecutor(this);
    
    UsuarioController usuDAO = new UsuarioController();
           

   
    public ReadQR() {
        initComponents();
        initWebcam();
        setLocationRelativeTo(null);
        this.setResizable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        resulta = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanesalir = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(9, 29, 54));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("resultado");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 60, -1));

        resulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultaActionPerformed(evt);
            }
        });
        jPanel1.add(resulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 460, 20));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 270));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 488, 349));

        jPanesalir.setBackground(new java.awt.Color(204, 0, 0));
        jPanesalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanesalirMouseClicked(evt);
            }
        });
        jPanesalir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/MingcuteLeftFill.png"))); // NOI18N
        jPanesalir.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 0, -1, 24));

        jPanel3.add(jPanesalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 60, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_resultaActionPerformed

    private void jPanesalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanesalirMouseClicked
      if(webcam.isOpen())
          webcam.close();
         dispose();
    }//GEN-LAST:event_jPanesalirMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReadQR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ReadQR().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanesalir;
    private javax.swing.JTextField resulta;
    // End of variables declaration//GEN-END:variables
    
    
    
    private void initWebcam(){
     
     Dimension size = WebcamResolution.QVGA.getSize();
     webcam = Webcam.getWebcams().get(0); // 0 es camara por defecto
     webcam.setViewSize(size);
     
     panel =  new WebcamPanel(webcam);
     panel.setPreferredSize(size);
     panel.setFPSDisplayed(true);
     
     jPanel1.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 270));
     executor.execute(this);
    }
    
    
    
    @Override
    public void run () {
     do{
         try {
             Thread.sleep(100);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         Result result = null;
         BufferedImage image = null;
         
         if (webcam.isOpen()) {
             
             image = webcam.getImage();
             
             if(image == null) {
                 System.out.println("no se pudo capturar imagen");
                 continue;
             }
         }else{
             continue;
         }
         
         
         
         try {
             LuminanceSource source = new BufferedImageLuminanceSource(image);
             BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
             result = new MultiFormatReader().decode(bitmap);
         } catch (NotFoundException e) {
             // no result...
         }catch(Exception e){
             e.printStackTrace();
             System.out.println("error procesando imagen");
         }
         
         
         if (result != null) {
             resulta.setText(result.getText());
             buscarEnBaseDeDatos(result.getText());
         }
     }  while(true);
     
    
    }
    
   private void buscarEnBaseDeDatos(String codigoQR) {
    PreparedStatement stmt = null;
    ResultSet rs = null;

    try {
        // asegurar de que la conexión esté establecida
        if (conn == null || conn.isClosed()) {
            conn = cn.getConnection(); // Obtener la conexión si no está activa
        }

       
        String sql = "SELECT nombre FROM usuario WHERE id = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, codigoQR); 

        rs = stmt.executeQuery();

        if (rs.next()) {
            String nombre = rs.getString("nombre");

            
            if ("andres".equalsIgnoreCase(nombre)) {
                JOptionPane.showMessageDialog(this, "BIENVENIDO", 
                        "Título", JOptionPane.PLAIN_MESSAGE, icono("/img/MdiDumbbell.png", 40, 40));
            } else {
                JOptionPane.showMessageDialog(this, "USUARIO NO REGISTRADO COMO ANDRES", 
                        "MENSAJE DEL SISTEMA", JOptionPane.ERROR_MESSAGE);
            }
        } else {
           
            JOptionPane.showMessageDialog(this, "USUARIO NO REGISTRADO", 
                    "MENSAJE DEL SISTEMA", JOptionPane.ERROR_MESSAGE);
        }

    } catch (SQLException e) {
       
        JOptionPane.showMessageDialog(this, "Error en la base de datos: " + e.getMessage(), 
                "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();

    } finally {
        // Cerrar ResultSet y PreparedStatement
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
 
 public Icon icono(String path, int width, int heigth){
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().getScaledInstance(width, heigth, java.awt.Image.SCALE_SMOOTH));
        return img;
    }
    
    
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r,"My Thread");
        t.setDaemon(true);
        return t;
    }
}
