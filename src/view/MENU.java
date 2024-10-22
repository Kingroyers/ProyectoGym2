package view;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

public class MENU extends javax.swing.JFrame {

    public MENU() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        setIconImage(getIconImage());
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/IconBF2.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        MenuDesplegable = new javax.swing.JPanel();
        panelHome = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panelUsuarios = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btn_validarEntrada = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        labelDespl = new javax.swing.JLabel();
        Dezplegable = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelHome = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanelRegitrarUsuario = new javax.swing.JPanel();
        jPanelUsuariosTbla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMostrarUsuario = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        resultaQr = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("GESTION");
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(9, 29, 54));
        jPanel2.setForeground(new java.awt.Color(69, 129, 171));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo2BF.png"))); // NOI18N
        jLabel9.setText("Bahía Fit");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel9)
                .addContainerGap(1048, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(12, 12, 12))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1280, 70));

        MenuDesplegable.setBackground(new java.awt.Color(45, 77, 102));
        MenuDesplegable.setPreferredSize(new java.awt.Dimension(290, 720));
        MenuDesplegable.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelHome.setBackground(new java.awt.Color(62, 98, 128));
        panelHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelHomeMouseEntered(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(110, 155, 181));
        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/MingcuteHome2Fill (1).png"))); // NOI18N
        jLabel3.setText("HOME");

        javax.swing.GroupLayout panelHomeLayout = new javax.swing.GroupLayout(panelHome);
        panelHome.setLayout(panelHomeLayout);
        panelHomeLayout.setHorizontalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        panelHomeLayout.setVerticalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHomeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        MenuDesplegable.add(panelHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 250, 30));

        panelUsuarios.setBackground(new java.awt.Color(62, 98, 128));
        panelUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelUsuariosMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/iconoUsers (1).png"))); // NOI18N
        jLabel7.setText("USUARIOS");

        javax.swing.GroupLayout panelUsuariosLayout = new javax.swing.GroupLayout(panelUsuarios);
        panelUsuarios.setLayout(panelUsuariosLayout);
        panelUsuariosLayout.setHorizontalGroup(
            panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUsuariosLayout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(83, 83, 83))
        );
        panelUsuariosLayout.setVerticalGroup(
            panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        MenuDesplegable.add(panelUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 250, -1));

        btn_validarEntrada.setBackground(new java.awt.Color(62, 98, 128));
        btn_validarEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_validarEntradaMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/iconoUsers (1).png"))); // NOI18N
        jLabel5.setText("ACCESO");

        javax.swing.GroupLayout btn_validarEntradaLayout = new javax.swing.GroupLayout(btn_validarEntrada);
        btn_validarEntrada.setLayout(btn_validarEntradaLayout);
        btn_validarEntradaLayout.setHorizontalGroup(
            btn_validarEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_validarEntradaLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel5)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        btn_validarEntradaLayout.setVerticalGroup(
            btn_validarEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_validarEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        MenuDesplegable.add(btn_validarEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 250, -1));

        labelDespl.setBackground(new java.awt.Color(255, 255, 255));
        labelDespl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/MingcuteLeftFill.png"))); // NOI18N
        labelDespl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDesplMouseClicked(evt);
            }
        });
        MenuDesplegable.add(labelDespl, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, 30));

        Dezplegable.setBackground(new java.awt.Color(45, 77, 102));
        Dezplegable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DezplegableMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout DezplegableLayout = new javax.swing.GroupLayout(Dezplegable);
        Dezplegable.setLayout(DezplegableLayout);
        DezplegableLayout.setHorizontalGroup(
            DezplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        DezplegableLayout.setVerticalGroup(
            DezplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        MenuDesplegable.add(Dezplegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 70, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AvatarAdmin.png"))); // NOI18N
        MenuDesplegable.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fulanito Detal");
        MenuDesplegable.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(62, 129, 171));
        jLabel16.setText("Admin");
        MenuDesplegable.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        getContentPane().add(MenuDesplegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 290, 660));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 990, 110));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setDoubleBuffered(true);
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jTabbedPane1.setOpaque(true);
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1010, 100));

        jPanelHome.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(62, 129, 171));
        jPanel5.setPreferredSize(new java.awt.Dimension(982, 150));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Gestión de Usuarios de Bahía Fit");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Bienvenido/a");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("<html>Sistema de Gestión de Usuarios - Gimnasio Bahía Fit: Controla y administra<p> de manera eficiente la información personal de los usuarios y el acceso<p> automatizado a las instalaciones del gimnasio.");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Caracteristicas del programa:");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Usuarios: Permite agregar, modificar, eliminar y buscar usuarios.");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("<html>Acceso: Los usuarios escanean su QR para ingresar al gimnasio, donde una<p> pantalla muestra si tienen acceso habilitado o bloqueado.  ");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Group 4 (1).png"))); // NOI18N
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, -1, -1));

        javax.swing.GroupLayout jPanelHomeLayout = new javax.swing.GroupLayout(jPanelHome);
        jPanelHome.setLayout(jPanelHomeLayout);
        jPanelHomeLayout.setHorizontalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelHomeLayout.setVerticalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHomeLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("HOME", jPanelHome);

        jPanelRegitrarUsuario.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelRegitrarUsuarioLayout = new javax.swing.GroupLayout(jPanelRegitrarUsuario);
        jPanelRegitrarUsuario.setLayout(jPanelRegitrarUsuarioLayout);
        jPanelRegitrarUsuarioLayout.setHorizontalGroup(
            jPanelRegitrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 988, Short.MAX_VALUE)
        );
        jPanelRegitrarUsuarioLayout.setVerticalGroup(
            jPanelRegitrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("REGISTRAR", jPanelRegitrarUsuario);

        jPanelUsuariosTbla.setBackground(new java.awt.Color(255, 255, 255));
        jPanelUsuariosTbla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelUsuariosTbla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jScrollPane1.setOpaque(false);

        jTableMostrarUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jTableMostrarUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PAGO", "IDENTIFICACION", "NOMBRE", "APELLIDO", "CORREO", "TELEFONO", "PLAN"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableMostrarUsuario);
        if (jTableMostrarUsuario.getColumnModel().getColumnCount() > 0) {
            jTableMostrarUsuario.getColumnModel().getColumn(0).setMinWidth(50);
            jTableMostrarUsuario.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTableMostrarUsuario.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jPanelUsuariosTbla.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 940, 470));

        jButton1.setText("ACTUALIZAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelUsuariosTbla.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 120, 30));

        jButton2.setText("ELIMINAR USUARIO");
        jPanelUsuariosTbla.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, 140, 30));
        jPanelUsuariosTbla.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 520, 250, -1));

        jLabel6.setText("BUSCAR:");
        jPanelUsuariosTbla.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 520, 50, 20));

        jTabbedPane1.addTab("USUARIOS", jPanelUsuariosTbla);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 302, Short.MAX_VALUE)
        );

        resultaQr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultaQrActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido a la Gestion de Usuarios de Bahía Fit");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(279, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resultaQr))
                .addGap(275, 275, 275))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(resultaQr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("VALIDAR", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 990, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHomeMouseClicked
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_panelHomeMouseClicked

    private void resultaQrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultaQrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultaQrActionPerformed

    private void labelDesplMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDesplMouseClicked

    }//GEN-LAST:event_labelDesplMouseClicked

    private void DezplegableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DezplegableMouseClicked

    }//GEN-LAST:event_DezplegableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_validarEntradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_validarEntradaMouseClicked
        ReadQR sis = new ReadQR();
        sis.setVisible(true);


    }//GEN-LAST:event_btn_validarEntradaMouseClicked

    private void panelUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelUsuariosMouseClicked
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_panelUsuariosMouseClicked

    private void panelHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHomeMouseEntered

    }//GEN-LAST:event_panelHomeMouseEntered

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Dezplegable;
    private javax.swing.JPanel MenuDesplegable;
    private javax.swing.JPanel btn_validarEntrada;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelHome;
    private javax.swing.JPanel jPanelRegitrarUsuario;
    private javax.swing.JPanel jPanelUsuariosTbla;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableMostrarUsuario;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelDespl;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelUsuarios;
    private javax.swing.JTextField resultaQr;
    // End of variables declaration//GEN-END:variables
}
