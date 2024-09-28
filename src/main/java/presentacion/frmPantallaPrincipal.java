/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

/**
 *
 * @author joelr
 */
public class frmPantallaPrincipal extends javax.swing.JFrame {

    private boolean logeado; //Variable para indicar si el usuario se encuentra logeado.

    /**
     * Creates new form frmPantallaPrincipal
     */
    public frmPantallaPrincipal() {
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
        jButtonIniciarSesion = new javax.swing.JButton();
        jButtonRegistrarse = new javax.swing.JButton();
        jButtonCartelera = new javax.swing.JButton();
        jLabelTitulo1 = new javax.swing.JLabel();
        jLabelPelicula1 = new javax.swing.JLabel();
        jLabelPelicula2 = new javax.swing.JLabel();
        jLabelPelicula3 = new javax.swing.JLabel();
        jLabelTitulo2 = new javax.swing.JLabel();
        jLabelTitulo3 = new javax.swing.JLabel();
        jLabelPromocional = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelFondo.setBackground(new java.awt.Color(0, 0, 0));
        PanelFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        PanelBarraCinepolis.setBackground(new java.awt.Color(51, 51, 255));

        jLabelCinepolis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCinepolis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosPresentacion/IconCinepolis2.png"))); // NOI18N
        jLabelCinepolis.setText("jLabel1");

        jButtonIniciarSesion.setBackground(new java.awt.Color(204, 204, 204));
        jButtonIniciarSesion.setText("Iniciar Sesion");
        jButtonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarSesionActionPerformed(evt);
            }
        });

        jButtonRegistrarse.setText("Registrarse");
        jButtonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarseActionPerformed(evt);
            }
        });

        jButtonCartelera.setBackground(new java.awt.Color(255, 255, 102));
        jButtonCartelera.setText("Cartelera");
        jButtonCartelera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCarteleraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBarraCinepolisLayout = new javax.swing.GroupLayout(PanelBarraCinepolis);
        PanelBarraCinepolis.setLayout(PanelBarraCinepolisLayout);
        PanelBarraCinepolisLayout.setHorizontalGroup(
            PanelBarraCinepolisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBarraCinepolisLayout.createSequentialGroup()
                .addComponent(jLabelCinepolis, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButtonCartelera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonIniciarSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRegistrarse)
                .addGap(26, 26, 26))
        );
        PanelBarraCinepolisLayout.setVerticalGroup(
            PanelBarraCinepolisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBarraCinepolisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelCinepolis, javax.swing.GroupLayout.PREFERRED_SIZE, 88, Short.MAX_VALUE)
                .addComponent(jButtonIniciarSesion)
                .addComponent(jButtonRegistrarse)
                .addComponent(jButtonCartelera))
        );

        jLabelTitulo1.setForeground(new java.awt.Color(255, 255, 0));
        jLabelTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo1.setText("Harry Potter y la piedra filosofal");

        jLabelPelicula1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPelicula1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPelicula1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosPresentacion/HarryPotter1.jpg"))); // NOI18N
        jLabelPelicula1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelPelicula1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPelicula1MouseClicked(evt);
            }
        });

        jLabelPelicula2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPelicula2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPelicula2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosPresentacion/HarryPotter2.jpeg"))); // NOI18N
        jLabelPelicula2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelPelicula2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPelicula2MouseClicked(evt);
            }
        });

        jLabelPelicula3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPelicula3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPelicula3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosPresentacion/HarryPotter3.jpg"))); // NOI18N
        jLabelPelicula3.setText("jLabel1");
        jLabelPelicula3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelPelicula3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPelicula3MouseClicked(evt);
            }
        });

        jLabelTitulo2.setForeground(new java.awt.Color(255, 255, 0));
        jLabelTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo2.setText("Harry Potter y la camara secreta");

        jLabelTitulo3.setForeground(new java.awt.Color(255, 255, 0));
        jLabelTitulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo3.setText("Harry Potter y el prisionero de Azkaban");

        jLabelPromocional.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelPromocional.setForeground(new java.awt.Color(255, 255, 0));
        jLabelPromocional.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPromocional.setText("MARATON DE HARRY POTTER");

        javax.swing.GroupLayout PanelFondoLayout = new javax.swing.GroupLayout(PanelFondo);
        PanelFondo.setLayout(PanelFondoLayout);
        PanelFondoLayout.setHorizontalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBarraCinepolis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFondoLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabelTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabelPelicula1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabelPelicula2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPelicula3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTitulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabelPromocional, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelFondoLayout.setVerticalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addComponent(PanelBarraCinepolis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137)
                .addComponent(jLabelPromocional, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelPelicula1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelPelicula3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelPelicula2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitulo1)
                    .addComponent(jLabelTitulo2)
                    .addComponent(jLabelTitulo3))
                .addContainerGap(168, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelPelicula1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPelicula1MouseClicked
        if (logeado = false) {
            frmRegistro registro = new frmRegistro();
            registro.setVisible(true);
        }
    }//GEN-LAST:event_jLabelPelicula1MouseClicked

    private void jLabelPelicula2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPelicula2MouseClicked
        if (logeado = false) {
            frmRegistro registro = new frmRegistro();
            registro.setVisible(true);
        }
    }//GEN-LAST:event_jLabelPelicula2MouseClicked

    private void jButtonCarteleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCarteleraActionPerformed
        frmCartelera cartelera = new frmCartelera();
        cartelera.setVisible(true);
    }//GEN-LAST:event_jButtonCarteleraActionPerformed

    private void jButtonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarSesionActionPerformed
        frmInicioSesion iniciarsesion = new frmInicioSesion();
        iniciarsesion.setVisible(true);
    }//GEN-LAST:event_jButtonIniciarSesionActionPerformed

    private void jButtonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarseActionPerformed
        frmRegistro registro = new frmRegistro();
        registro.setVisible(true);
    }//GEN-LAST:event_jButtonRegistrarseActionPerformed

    private void jLabelPelicula3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPelicula3MouseClicked
        if (logeado = false) {
            frmRegistro registro = new frmRegistro();
            registro.setVisible(true);
        }
    }//GEN-LAST:event_jLabelPelicula3MouseClicked

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
            java.util.logging.Logger.getLogger(frmPantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new frmPantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBarraCinepolis;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JButton jButtonCartelera;
    private javax.swing.JButton jButtonIniciarSesion;
    private javax.swing.JButton jButtonRegistrarse;
    private javax.swing.JLabel jLabelCinepolis;
    private javax.swing.JLabel jLabelPelicula1;
    private javax.swing.JLabel jLabelPelicula2;
    private javax.swing.JLabel jLabelPelicula3;
    private javax.swing.JLabel jLabelPromocional;
    private javax.swing.JLabel jLabelTitulo1;
    private javax.swing.JLabel jLabelTitulo2;
    private javax.swing.JLabel jLabelTitulo3;
    // End of variables declaration//GEN-END:variables
}
