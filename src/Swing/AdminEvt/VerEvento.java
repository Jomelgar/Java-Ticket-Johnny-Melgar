package Swing.AdminEvt;

import Eventos.Deporte;
import Eventos.Evento;
import Eventos.Musical;
import Eventos.Religioso;
import Swing.Inicializador;
import java.util.Calendar;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author jomel
 */
public class VerEvento extends javax.swing.JDialog {
    
    private Eventos.Evento evento;
    private int tipo;
    
    public VerEvento(int Tipo, Evento evento) {
        super(new java.awt.Frame(),true);
        this.evento = evento;
        initComponents();
        this.tipo = Tipo;
        switch(tipo){
            case 1: 
                TipoEvento1.setText("Evento Deportivo");
                break;
            case 2:
                TipoEvento1.setText("Evento Musical");
                break;
            default:
                TipoEvento1.setText("Evento Religioso");
        }
        asignaTipo();
        if(evento != null){
            agregarDatosBasicos();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        TipoEvento1 = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TextoNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextoDesc = new javax.swing.JTextArea();
        Fechas = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        TiposTexto = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        BtCancelar = new javax.swing.JButton();
        TextoPersonas = new javax.swing.JTextField();
        TextoMonto = new javax.swing.JTextField();
        Tipos = new javax.swing.JComboBox<>();
        Contenido = new javax.swing.JPanel();
        Imagen = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TipoEvento1.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        TipoEvento1.setForeground(new java.awt.Color(204, 204, 204));
        TipoEvento1.setText("User Code");
        jPanel3.add(TipoEvento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 240, 40));

        Titulo.setFont(new java.awt.Font("Sitka Banner", 0, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(204, 204, 204));
        Titulo.setText("");
        if(evento == null){
            Titulo.setText("Creación de Evento.");
        }else{
            Titulo.setText("Edición de Evento");
        }
        jPanel3.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Nombre de Evento:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        TextoNombre.setEditable(false);
        TextoNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel3.add(TextoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 220, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Descripción del Evento:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        TextoDesc.setEditable(false);
        TextoDesc.setColumns(20);
        TextoDesc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TextoDesc.setRows(5);
        jScrollPane1.setViewportView(TextoDesc);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 320, 70));

        Fechas.setDateFormatString("dd/MM/yy");
        jPanel3.add(Fechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 210, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Fecha:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Monto (En Lps.):");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        TiposTexto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TiposTexto.setForeground(new java.awt.Color(204, 204, 204));
        TiposTexto.setText("Tipo de Evento:");
        jPanel3.add(TiposTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Cantidad de Personas:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        BtCancelar.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        BtCancelar.setText("Salir");
        BtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCancelarActionPerformed(evt);
            }
        });
        jPanel3.add(BtCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 120, 50));

        TextoPersonas.setEditable(false);
        TextoPersonas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TextoPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoPersonasActionPerformed(evt);
            }
        });
        TextoPersonas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextoPersonasKeyTyped(evt);
            }
        });
        jPanel3.add(TextoPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 140, -1));

        TextoMonto.setEditable(false);
        TextoMonto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TextoMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoMontoActionPerformed(evt);
            }
        });
        TextoMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextoMontoKeyTyped(evt);
            }
        });
        jPanel3.add(TextoMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 140, -1));

        Tipos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Tipos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(Tipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 100, -1));

        Contenido.setBackground(new java.awt.Color(51, 51, 51));

        Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo_Grande.png"))); // NOI18N

        javax.swing.GroupLayout ContenidoLayout = new javax.swing.GroupLayout(Contenido);
        Contenido.setLayout(ContenidoLayout);
        ContenidoLayout.setHorizontalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenidoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Imagen)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        ContenidoLayout.setVerticalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenidoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Imagen)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel3.add(Contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 360, 240));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("*Detalle*: (Nada escrito aqui afectara al evento).");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 340, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextoPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoPersonasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoPersonasActionPerformed

    private void TextoPersonasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextoPersonasKeyTyped
        // TODO add your handling code here:
        int tecla = evt.getKeyChar();
        boolean valido = tecla >= 48 && tecla <= 57;
        if(!valido){
            evt.consume();
        }
    }//GEN-LAST:event_TextoPersonasKeyTyped

    private void TextoMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoMontoActionPerformed

    private void TextoMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextoMontoKeyTyped
        // TODO add your handling code here:
        int tecla = evt.getKeyChar();
        boolean valido = tecla >= 48 && tecla <= 57 || '.' == evt.getKeyChar();

        if(!valido){
            evt.consume();
        }
    }//GEN-LAST:event_TextoMontoKeyTyped

    private void BtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BtCancelarActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCancelar;
    private javax.swing.JPanel Contenido;
    private com.toedter.calendar.JDateChooser Fechas;
    private javax.swing.JLabel Imagen;
    private javax.swing.JTextArea TextoDesc;
    private javax.swing.JTextField TextoMonto;
    private javax.swing.JTextField TextoNombre;
    private javax.swing.JTextField TextoPersonas;
    private javax.swing.JLabel TipoEvento1;
    private javax.swing.JComboBox<String> Tipos;
    private javax.swing.JLabel TiposTexto;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

        public String getCodigoOG(){
        String ID = "F-";
        int num = new Random().nextInt(10_100)+ 100;
        if(Inicializador.GestorEventos.busquedaCodigo(ID + num) == null){
            return Integer.toString(num);
        }
        return getCodigoOG();
    }
    
    private void asignaTipo() {
        switch(tipo){
            case 1:
                TiposTexto.setText("Tipo de Deporte:");
                Tipos.setModel(new javax.swing.DefaultComboBoxModel<>
                (new String[] { "FUTBOL", "TENIS", "RUGBY", "BASEBALL" }));
                Tipos.setSelectedItem(null);
                break;
            case 2:
                TiposTexto.setText("Tipo de Musica:");
                Tipos.setModel(new javax.swing.DefaultComboBoxModel<>
                (new String[] { "CLASICA", "POP", "ROCK", "REGGAETON", "RAP", "OTRO"}));
                Tipos.setSelectedItem(null);
                break;
            case 3:
                TiposTexto.setVisible(false);
                Tipos.setVisible(false);
                break;
        }
    }
    
    private boolean camposCorrectos(){
            return !TextoNombre.getText().trim().isEmpty()
            && Fechas.getDate() != null && 
            Fechas.getDate().after(Calendar.getInstance().getTime())
            && convMonto() 
            && !TextoDesc.getText().trim().isEmpty() 
            && !TextoPersonas.getText().trim().isEmpty()
            && (tipo == 3 || Tipos.getSelectedItem() != null)
            && (evento == null || EditObjetoCorrecta());
    }
    
    public boolean convMonto(){
        try{
            double num = Double.parseDouble(TextoMonto.getText());
            return true;
        }catch(Exception e){
            return false;
        }
    }

    private Eventos.Deporte.TipoDeporte asignaDeporte() {
        switch(Tipos.getSelectedItem().toString()){
            case "BASKETBALL":
                return Deporte.TipoDeporte.BASEBALL;
            case "FUTBOL":
                return Deporte.TipoDeporte.FUTBOL;
            case "RUGBY":
                return Deporte.TipoDeporte.RUGBY;
            default:
                return Deporte.TipoDeporte.TENIS;
        }
    }
    
    private Eventos.Musical.TipoMusical asignaMusica() {
        switch(Tipos.getSelectedItem().toString()){
            case "CLASICA":
                return Musical.TipoMusical.CLASICA;
            case "ROCK":
                return Musical.TipoMusical.ROCK;
            case "RAP":
                return Musical.TipoMusical.RAP;
            case "REGGAETON":
                return Musical.TipoMusical.REGGAETON;
            case "POP":
                return Musical.TipoMusical.POP;
            default:
                return Musical.TipoMusical.OTRO;
        }
    }
    
    private boolean EditObjetoCorrecta(){
        switch(tipo){
            case 1:
                return !Deportes.Equipo1.getText().trim().isEmpty()
                        && !Deportes.Equipo2.getText().trim().isEmpty();
            case 2:
                return !Musica.Musicos.getText().trim().isEmpty()
                        && !Musica.Cargo.getText().trim().isEmpty();
            default:
                return !Religion.CantConvertidos.getText().trim().isEmpty();
        }
    }

    private void agregarDatosBasicos() {
        TextoNombre.setText(evento.getTitulo());
        TextoDesc.setText(evento.getDescripcion());
        TextoMonto.setText(evento.getRenta().toString());
        TextoPersonas.setText(Integer.toString(evento.getGente()));
        Fechas.setDate(evento.getFecha().getTime());
        switch(tipo){
            case 1:
                agregaPanel(new Deportes());
                if(evento.getTipoEvt().equals(Evento.TipoEvento.DEPORTE)){
                    Deporte deporte = (Deporte)evento;
                    if(deporte.getEquipo1()  != null&& deporte.getEquipo2() != null){
                        Deportes.Equipo1.setText(deporte.getEquipo1());
                        Deportes.Equipo2.setText(deporte.getEquipo2());
                        Deportes.Equipo1.setEditable(false);
                        Deportes.Equipo2.setEditable(false);
                    }
                    switch(deporte.getTipo().toString()){
                        case "FUTBOL":
                            Tipos.setSelectedIndex(0);
                            break;
                        case "TENIS":
                            Tipos.setSelectedIndex(1);
                            break;
                        case "RUGBY":
                            Tipos.setSelectedIndex(2);
                            break;
                        case "BASEBALL":
                            Tipos.setSelectedIndex(3);
                            break;
                    }
                    
                }
                break;
            case 2:
                agregaPanel(new Musica());
                if(evento.getTipoEvt().equals(Evento.TipoEvento.MUSICAL)){
                   Musical musica = (Musical)evento;
                    if(musica.getPersonas() != null && musica.getCargos() != null){
                        Musica.Musicos.setText(musica.getPersonas());
                        Musica.Cargo.setText(musica.getCargos());
                        Musica.Musicos.setEditable(false);
                        Musica.Cargo.setEditable(false);
                    } 
                    switch(musica.getTipo().toString()){
                        case "CLASICA":
                            Tipos.setSelectedIndex(0);
                            break;
                        case "POP":
                            Tipos.setSelectedIndex(1);
                            break;
                        case "ROCK":
                            Tipos.setSelectedIndex(2);
                            break;
                        case "REGGAETON":
                            Tipos.setSelectedIndex(3);
                            break;
                        case "RAP":
                            Tipos.setSelectedIndex(4);
                            break;
                        case "OTRO":
                            Tipos.setSelectedIndex(5);
                            break;
                    }
                }
                break;
            case 3:
                agregaPanel(new Religion());
                if(evento.getTipoEvt().equals(Evento.TipoEvento.RELIGIOSO)){
                    Religioso religion = (Religioso)evento;
                    if(religion.getConvertidos() > 0){
                        Religion.CantConvertidos.setText(Integer.toString(religion.getConvertidos()));
                        Religion.CantConvertidos.setEditable(false);
                    }
                }
                break;
        }
    }
    
    public void agregaPanel(javax.swing.JPanel panel){
        panel.setSize(360,240);
        panel.setLocation(0,0);
        Contenido.removeAll();
        Contenido.add(panel);
        Contenido.revalidate();
        Contenido.repaint();
        Contenido.setVisible(true);
    }
}
