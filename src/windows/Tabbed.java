/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

/**
 *
 * @author Steven
 */
public class Tabbed extends javax.swing.JFrame {

    /**
     * Creates new form tabbed
     */
    public Tabbed() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panel1 = new java.awt.Panel();
        closeS1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        title1 = new javax.swing.JLabel();
        background4 = new javax.swing.JLabel();
        panel2 = new java.awt.Panel();
        closeS2 = new javax.swing.JButton();
        upload = new javax.swing.JButton();
        background2 = new javax.swing.JLabel();
        panel3 = new java.awt.Panel();
        closeS3 = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        professor1 = new javax.swing.JLabel();
        profId = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        background3 = new javax.swing.JLabel();
        panel4 = new java.awt.Panel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        closeS = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(550, 400));

        panel1.setMinimumSize(new java.awt.Dimension(550, 360));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeS1.setText("Cerrar Sesión");
        closeS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeS1ActionPerformed(evt);
            }
        });
        panel1.add(closeS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 115, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Juan Perez",  new Integer(31421),  new Boolean(true)},
                {"Steven Marquez",  new Integer(72741),  new Boolean(true)},
                {"Alan Martinez",  new Integer(37619), null},
                {"Silvia Armendariz",  new Integer(53298),  new Boolean(true)},
                {"Paulina Chacon",  new Integer(41987),  new Boolean(true)},
                {"Marta Bollaños",  new Integer(24187), null},
                {"Kenia Vaca",  new Integer(31237),  new Boolean(true)},
                {"Saire Esquivel",  new Integer(32418), null},
                {"Yair Rodriguez",  new Integer(34187), null},
                {"José de Leon", null, null}
            },
            new String [] {
                "Nombre", "Numero de empleado", "Asistencía"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        panel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 190));

        title1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        title1.setText("Asistentes");
        panel1.add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        background4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background2.jpg"))); // NOI18N
        background4.setText("jLabel1");
        panel1.add(background4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 360));

        jTabbedPane1.addTab("Confirmación", panel1);

        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeS2.setText("Cerrar Sesión");
        closeS2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeS2ActionPerformed(evt);
            }
        });
        panel2.add(closeS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 115, -1));

        upload.setText("Subir listado de profesores");
        upload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uploadMouseClicked(evt);
            }
        });
        panel2.add(upload, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        background2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background2.jpg"))); // NOI18N
        background2.setText("jLabel1");
        panel2.add(background2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 360));

        jTabbedPane1.addTab("Subir asistentes", panel2);

        panel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeS3.setText("Cerrar Sesión");
        closeS3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeS3ActionPerformed(evt);
            }
        });
        panel3.add(closeS3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 115, -1));

        title.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        title.setText("Agregar nuevo asistente");
        panel3.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        id.setText("Número de empleado");
        panel3.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        panel3.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 200, -1));

        professor1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        professor1.setText("Nombre");
        panel3.add(professor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));
        panel3.add(profId, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 200, -1));

        btnAdd.setText("Agregar");
        panel3.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, -1, -1));

        background3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background2.jpg"))); // NOI18N
        background3.setText("jLabel1");
        panel3.add(background3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 350));

        jTabbedPane1.addTab("Agregar asistentes", panel3);

        panel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setText("Porcentaje y numero de asistencia");
        panel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("5/10");
        panel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("50%");
        panel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        jProgressBar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jProgressBar1.setMaximum(20);
        jProgressBar1.setValue(10);
        panel4.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 228, 40));

        closeS.setText("Cerrar Sesión");
        closeS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeSActionPerformed(evt);
            }
        });
        panel4.add(closeS, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 115, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background2.jpg"))); // NOI18N
        background.setText("jLabel1");
        background.setMaximumSize(new java.awt.Dimension(2000, 1000));
        background.setMinimumSize(new java.awt.Dimension(2000, 1000));
        panel4.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 350));

        jTabbedPane1.addTab("Asistencia", panel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeSActionPerformed
        Login log = new Login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_closeSActionPerformed

    private void closeS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeS1ActionPerformed
        Login log = new Login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_closeS1ActionPerformed

    private void closeS2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeS2ActionPerformed
        Login log = new Login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_closeS2ActionPerformed

    private void closeS3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeS3ActionPerformed
        Login log = new Login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_closeS3ActionPerformed

    private void uploadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadMouseClicked
        Fileup up = new Fileup();
        up.setVisible(true);
    }//GEN-LAST:event_uploadMouseClicked

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabbed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Tabbed().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel background2;
    private javax.swing.JLabel background3;
    private javax.swing.JLabel background4;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton closeS;
    private javax.swing.JButton closeS1;
    private javax.swing.JButton closeS2;
    private javax.swing.JButton closeS3;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField name;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private java.awt.Panel panel4;
    private javax.swing.JTextField profId;
    private javax.swing.JLabel professor1;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JButton upload;
    // End of variables declaration//GEN-END:variables
}
