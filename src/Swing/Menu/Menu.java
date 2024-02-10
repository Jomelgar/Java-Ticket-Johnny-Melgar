
package Swing.Menu;
import Swing.AdminUsr.BuscadorDeUsuario;
import Swing.AdminEvt.EleccionDeCodigo;
import Swing.AdminUsr.EleccionDeCuenta;
import Swing.AdminEvt.EleccionDeEvento;
import Swing.LogIn;
import Usuarios.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author jomel
 */

public class Menu extends javax.swing.JFrame {
    
    private AdminEvt Aevt = new AdminEvt(this);
    private AdminUsr Ausr = new AdminUsr(this);
    private AdminRep Arep = new AdminRep();
    public Menu() {
        initComponents();
        contenido.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        contenido = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ButAdEventos = new javax.swing.JButton();
        ButAdUsuarios = new javax.swing.JButton();
        ButReportes = new javax.swing.JButton();
        ButSalida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Ticket");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenido.setBackground(new java.awt.Color(51, 51, 51));
        contenido.setPreferredSize(new java.awt.Dimension(360, 160));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        jPanel1.add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 490, 370));

        jLabel1.setFont(new java.awt.Font("Sitka Banner", 0, 72)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema de Java Ticket");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 740, -1));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo_Grande.png"))); // NOI18N
        jPanel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText(Swing.Inicializador.usuario.getNombre() + ".");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, -1, 70));

        jLabel3.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Bienvenido Usuario: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, -1, 70));

        ButAdEventos.setBackground(new java.awt.Color(102, 102, 102));
        ButAdEventos.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        ButAdEventos.setForeground(new java.awt.Color(204, 204, 204));
        ButAdEventos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Evento.png"))); // NOI18N
        ButAdEventos.setText("   Administración de Eventos");
        ButAdEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButAdEventosActionPerformed(evt);
            }
        });
        jPanel1.add(ButAdEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 300, 50));

        ButAdUsuarios.setBackground(new java.awt.Color(102, 102, 102));
        ButAdUsuarios.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        ButAdUsuarios.setForeground(new java.awt.Color(204, 204, 204));
        ButAdUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Usuario.png"))); // NOI18N
        ButAdUsuarios.setText("   Administrador de Usuarios");
        ButAdUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButAdUsuariosActionPerformed(evt);
            }
        });
        jPanel1.add(ButAdUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 300, 50));

        ButReportes.setBackground(new java.awt.Color(102, 102, 102));
        ButReportes.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        ButReportes.setForeground(new java.awt.Color(204, 204, 204));
        ButReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reportes.png"))); // NOI18N
        ButReportes.setText("   Sistema de Reportes");
        ButReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButReportesActionPerformed(evt);
            }
        });
        jPanel1.add(ButReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 300, 50));

        ButSalida.setBackground(new java.awt.Color(102, 102, 102));
        ButSalida.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        ButSalida.setForeground(new java.awt.Color(204, 204, 204));
        ButSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        ButSalida.setText("   Salir");
        ButSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButSalidaActionPerformed(evt);
            }
        });
        jPanel1.add(ButSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 300, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButSalidaActionPerformed
        // TODO add your handling code here:
        LogIn inicio = new LogIn();
        inicio.setLocationRelativeTo(null);
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ButSalidaActionPerformed

    private void ButAdUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButAdUsuariosActionPerformed
        // TODO add your handling code here:
        agregaPanel(Ausr);
    }//GEN-LAST:event_ButAdUsuariosActionPerformed

    private void ButAdEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButAdEventosActionPerformed
        // TODO add your handling code here:
        agregaPanel(Aevt);
        
    }//GEN-LAST:event_ButAdEventosActionPerformed

    private void ButReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButReportesActionPerformed
        // TODO add your handling code here:
        agregaPanel(Arep);
    }//GEN-LAST:event_ButReportesActionPerformed

    public void agregaPanel(javax.swing.JPanel panel){
        panel.setSize(490,380);
        panel.setLocation(0,0);
        contenido.removeAll();
        contenido.add(panel);
        contenido.revalidate();
        contenido.repaint();
        contenido.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButAdEventos;
    private javax.swing.JButton ButAdUsuarios;
    private javax.swing.JButton ButReportes;
    private javax.swing.JButton ButSalida;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
