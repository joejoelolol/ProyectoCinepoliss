/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

/**
 *
 * @author joelr
 */
public class frmRecuperacionContraseña extends javax.swing.JFrame {
    /**
     * Creates new form frmPantallaPrincipal
     */
    public frmRecuperacionContraseña() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFondo = new javax.swing.JPanel();
        PanelBarraCinepolis = new javax.swing.JPanel();
        jLabelCinepolis = new javax.swing.JLabel();
        jLabelInicioSesion = new javax.swing.JLabel();
        jLabelCorreoElectronico = new javax.swing.JLabel();
        jTextFieldCorreoElectronico = new javax.swing.JTextField();
        jButtonEnviar = new javax.swing.JButton();
        jLabelReenviarCodigo = new javax.swing.JLabel();
        jLabelInicioSesion1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelFondo.setBackground(new java.awt.Color(0, 0, 0));
        PanelFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelFondo.setPreferredSize(new java.awt.Dimension(600, 600));

        PanelBarraCinepolis.setBackground(new java.awt.Color(51, 51, 255));

        jLabelCinepolis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCinepolis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosPresentacion/IconCinepolis2.png"))); // NOI18N
        jLabelCinepolis.setText("jLabel1");

        jLabelInicioSesion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelInicioSesion.setForeground(new java.awt.Color(255, 255, 0));
        jLabelInicioSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelInicioSesion.setText("Recuperar Contraseña");

        javax.swing.GroupLayout PanelBarraCinepolisLayout = new javax.swing.GroupLayout(PanelBarraCinepolis);
        PanelBarraCinepolis.setLayout(PanelBarraCinepolisLayout);
        PanelBarraCinepolisLayout.setHorizontalGroup(
            PanelBarraCinepolisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBarraCinepolisLayout.createSequentialGroup()
                .addComponent(jLabelCinepolis, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabelInicioSesion)
                .addContainerGap(256, Short.MAX_VALUE))
        );
        PanelBarraCinepolisLayout.setVerticalGroup(
            PanelBarraCinepolisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCinepolis, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBarraCinepolisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelInicioSesion)
                .addGap(20, 20, 20))
        );

        jLabelCorreoElectronico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelCorreoElectronico.setForeground(new java.awt.Color(255, 255, 0));
        jLabelCorreoElectronico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCorreoElectronico.setText("Codigo");

        jTextFieldCorreoElectronico.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldCorreoElectronico.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCorreoElectronico.setText("Codigo:");
        jTextFieldCorreoElectronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCorreoElectronicoActionPerformed(evt);
            }
        });

        jButtonEnviar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonEnviar.setForeground(new java.awt.Color(255, 255, 0));
        jButtonEnviar.setText("Enviar");

        jLabelReenviarCodigo.setForeground(new java.awt.Color(255, 255, 0));
        jLabelReenviarCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelReenviarCodigo.setText("Reenviar Codigo");

        jLabelInicioSesion1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelInicioSesion1.setForeground(new java.awt.Color(255, 255, 0));
        jLabelInicioSesion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelInicioSesion1.setText("Para recuperar su contraseña, enviaremos un correo con un codigo a su cuenta");

        javax.swing.GroupLayout PanelFondoLayout = new javax.swing.GroupLayout(PanelFondo);
        PanelFondo.setLayout(PanelFondoLayout);
        PanelFondoLayout.setHorizontalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBarraCinepolis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabelInicioSesion1))
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtonEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(PanelFondoLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabelReenviarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelFondoLayout.setVerticalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addComponent(PanelBarraCinepolis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabelInicioSesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCorreoElectronico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonEnviar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelReenviarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(330, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCorreoElectronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCorreoElectronicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCorreoElectronicoActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmRecuperacionContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRecuperacionContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRecuperacionContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRecuperacionContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRecuperacionContraseña().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBarraCinepolis;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JButton jButtonEnviar;
    private javax.swing.JLabel jLabelCinepolis;
    private javax.swing.JLabel jLabelCorreoElectronico;
    private javax.swing.JLabel jLabelInicioSesion;
    private javax.swing.JLabel jLabelInicioSesion1;
    private javax.swing.JLabel jLabelReenviarCodigo;
    private javax.swing.JTextField jTextFieldCorreoElectronico;
    // End of variables declaration//GEN-END:variables
}
