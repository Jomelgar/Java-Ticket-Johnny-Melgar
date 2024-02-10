package Swing.AdminRep;

/**
 *
 * @author jomel
 */
public class AdminRep extends javax.swing.JDialog {

    /**
     * Creates new form AdminRep
     */
    public AdminRep(int Caso) {
        super(new java.awt.Frame(), true);
        initComponents();
        this.setLocationRelativeTo(null);
        if(Caso == 5){
            agregaPanel(new Perfil());
        }else{
            switch(Caso){
                case 1:
                    agregaPanel(new Plantilla(1));
                    break;
                case 2:
                    agregaPanel(new Plantilla(2));
                    break;
                case 3:
                    agregaPanel(new Plantilla(3));
                    break;
                case 4:
                    agregaPanel(new FechaSelecc());
                    break;
            }
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo5 = new javax.swing.JLabel();
        FutRep = new javax.swing.JButton();
        RealRep = new javax.swing.JButton();
        CancelEvt = new javax.swing.JButton();
        FechRep = new javax.swing.JButton();
        RepPerfil = new javax.swing.JButton();
        Contenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Java Ticket");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo5.setFont(new java.awt.Font("Sitka Banner", 0, 48)); // NOI18N
        Titulo5.setForeground(new java.awt.Color(204, 204, 204));
        Titulo5.setText("Sistema de Reportes");
        jPanel1.add(Titulo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        FutRep.setBackground(new java.awt.Color(102, 102, 102));
        FutRep.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        FutRep.setForeground(new java.awt.Color(204, 204, 204));
        FutRep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reportes.png"))); // NOI18N
        FutRep.setText("Eventos Futuros");
        FutRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FutRepActionPerformed(evt);
            }
        });
        jPanel1.add(FutRep, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 220, -1));

        RealRep.setBackground(new java.awt.Color(102, 102, 102));
        RealRep.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        RealRep.setForeground(new java.awt.Color(204, 204, 204));
        RealRep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reportes.png"))); // NOI18N
        RealRep.setText("Eventos Realizados");
        RealRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealRepActionPerformed(evt);
            }
        });
        jPanel1.add(RealRep, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 220, -1));

        CancelEvt.setBackground(new java.awt.Color(102, 102, 102));
        CancelEvt.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        CancelEvt.setForeground(new java.awt.Color(204, 204, 204));
        CancelEvt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reportes.png"))); // NOI18N
        CancelEvt.setText("Eventos Cancelados");
        CancelEvt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelEvtActionPerformed(evt);
            }
        });
        jPanel1.add(CancelEvt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        FechRep.setBackground(new java.awt.Color(102, 102, 102));
        FechRep.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        FechRep.setForeground(new java.awt.Color(204, 204, 204));
        FechRep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reportes.png"))); // NOI18N
        FechRep.setText("Generado por Fecha");
        FechRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechRepActionPerformed(evt);
            }
        });
        jPanel1.add(FechRep, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        RepPerfil.setBackground(new java.awt.Color(102, 102, 102));
        RepPerfil.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        RepPerfil.setForeground(new java.awt.Color(204, 204, 204));
        RepPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Usuario.png"))); // NOI18N
        RepPerfil.setText("Ver Perfil");
        RepPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepPerfilActionPerformed(evt);
            }
        });
        jPanel1.add(RepPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 220, -1));

        Contenedor.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        jPanel1.add(Contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 440, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FutRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FutRepActionPerformed
        // TODO add your handling code here:
        agregaPanel(new Plantilla(1));
    }//GEN-LAST:event_FutRepActionPerformed

    private void RealRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RealRepActionPerformed
        // TODO add your handling code here:
        agregaPanel(new Plantilla(2));
    }//GEN-LAST:event_RealRepActionPerformed

    private void CancelEvtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelEvtActionPerformed
        // TODO add your handling code here:
        agregaPanel(new Plantilla(3));
    }//GEN-LAST:event_CancelEvtActionPerformed

    private void FechRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechRepActionPerformed
        // TODO add your handling code here:
        agregaPanel(new FechaSelecc());
    }//GEN-LAST:event_FechRepActionPerformed

    private void RepPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepPerfilActionPerformed
        // TODO add your handling code here:
        agregaPanel(new Perfil());
    }//GEN-LAST:event_RepPerfilActionPerformed

    public void agregaPanel(javax.swing.JPanel panel){
        panel.setSize(490,380);
        panel.setLocation(0,0);
        Contenedor.removeAll();
        Contenedor.add(panel);
        Contenedor.revalidate();
        Contenedor.repaint();
        Contenedor.setVisible(true);
    }
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
            java.util.logging.Logger.getLogger(AdminRep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminRep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminRep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminRep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdminRep dialog = new AdminRep(1);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelEvt;
    private javax.swing.JPanel Contenedor;
    private javax.swing.JButton FechRep;
    private javax.swing.JButton FutRep;
    private javax.swing.JButton RealRep;
    private javax.swing.JButton RepPerfil;
    private javax.swing.JLabel Titulo5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
