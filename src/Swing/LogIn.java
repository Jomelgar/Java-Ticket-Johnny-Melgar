
package Swing;

import Swing.Menu.Menu;

/**
 *
 * @author jomel
 */
public class LogIn extends javax.swing.JFrame {
    
    private final char caracter;
 
    public LogIn() {
        
        initComponents();
        TextoContra.setEchoChar('*');
        caracter = TextoContra.getEchoChar();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        LogIn = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TextoUsuario = new javax.swing.JTextField();
        Mostrar = new javax.swing.JToggleButton();
        TextoContra = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Ticket");
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogIn.setBackground(new java.awt.Color(102, 102, 102));
        LogIn.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        LogIn.setForeground(new java.awt.Color(204, 204, 204));
        LogIn.setText("Log In");
        LogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInActionPerformed(evt);
            }
        });
        jPanel2.add(LogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 140, 50));

        Titulo.setFont(new java.awt.Font("Sitka Text", 0, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(204, 204, 204));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo_Pequeño.png"))); // NOI18N
        Titulo.setText(" Java Ticket");
        jPanel2.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 350, -1));

        jLabel1.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Usuario:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Contraseña:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        TextoUsuario.setBackground(new java.awt.Color(30, 30, 30));
        TextoUsuario.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        TextoUsuario.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.add(TextoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 330, 50));

        Mostrar.setBackground(new java.awt.Color(204, 204, 204));
        Mostrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Mostrar.setForeground(new java.awt.Color(0, 0, 0));
        Mostrar.setText("(-.-)");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });
        jPanel2.add(Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, -1, 50));

        TextoContra.setBackground(new java.awt.Color(30, 30, 30));
        TextoContra.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        TextoContra.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.add(TextoContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 330, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInActionPerformed
        // TODO add your handling code here:
         Inicializador.usuario = Inicializador.GestorUsuarios.BusquedaUsuario
        (TextoUsuario.getText(), TextoContra.getText());
        if(Inicializador.usuario != null){
            Menu inicio = new Menu();
            inicio.setLocationRelativeTo(null);
            inicio.setVisible(true);
            this.dispose();
        }else{
            javax.swing.JOptionPane.showMessageDialog(null, "ERROR: USUARIO O CONTRASEÑA INVÁLIDA");
        }
    }//GEN-LAST:event_LogInActionPerformed

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
        // TODO add your handling code here:
        if(Mostrar.isSelected()){
            TextoContra.setEchoChar((char) 0);
            TextoContra.requestFocus();
            Mostrar.setText("(0.0)");
        }else{
            TextoContra.setEchoChar(caracter);
            Mostrar.setText("(-.-)");
        }
    }//GEN-LAST:event_MostrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogIn;
    private javax.swing.JToggleButton Mostrar;
    private javax.swing.JPasswordField TextoContra;
    private javax.swing.JTextField TextoUsuario;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
