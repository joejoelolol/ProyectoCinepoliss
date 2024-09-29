/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

/**
 *
 * @author joelr
 */
public class frmCatalogoAdminSalas extends javax.swing.JFrame {
//    private IClienteNegocio clienteNegocio;
    private int pagina = 1;
    private final int LIMITE = 20;
    /**
     * Creates new form frmPantallaPrincipal
     */
    public frmCatalogoAdminSalas() {
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
        jLabelConfigAdmin = new javax.swing.JLabel();
        jButtonVerPeliculas = new javax.swing.JButton();
        jLabelNombreTabla = new javax.swing.JLabel();
        jButtonAgregarPeliculas = new javax.swing.JButton();
        jButtonEliminarPeliculas = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablePeliculas = new javax.swing.JTable();
        btnPaginaAnterior = new javax.swing.JButton();
        lblNumeroPagina = new javax.swing.JLabel();
        btnPaginaSiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelFondo.setBackground(new java.awt.Color(0, 0, 0));
        PanelFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelFondo.setPreferredSize(new java.awt.Dimension(600, 600));

        PanelBarraCinepolis.setBackground(new java.awt.Color(51, 51, 255));

        jLabelCinepolis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCinepolis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosPresentacion/IconCinepolis2.png"))); // NOI18N
        jLabelCinepolis.setText("jLabel1");

        jLabelConfigAdmin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelConfigAdmin.setForeground(new java.awt.Color(255, 255, 0));
        jLabelConfigAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelConfigAdmin.setText("Editar Salas");

        javax.swing.GroupLayout PanelBarraCinepolisLayout = new javax.swing.GroupLayout(PanelBarraCinepolis);
        PanelBarraCinepolis.setLayout(PanelBarraCinepolisLayout);
        PanelBarraCinepolisLayout.setHorizontalGroup(
            PanelBarraCinepolisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBarraCinepolisLayout.createSequentialGroup()
                .addComponent(jLabelCinepolis, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(290, 290, 290)
                .addComponent(jLabelConfigAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelBarraCinepolisLayout.setVerticalGroup(
            PanelBarraCinepolisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCinepolis, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBarraCinepolisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelConfigAdmin)
                .addContainerGap())
        );

        jButtonVerPeliculas.setBackground(new java.awt.Color(0, 0, 0));
        jButtonVerPeliculas.setForeground(new java.awt.Color(255, 255, 0));
        jButtonVerPeliculas.setText("Editar");

        jLabelNombreTabla.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelNombreTabla.setForeground(new java.awt.Color(255, 255, 0));
        jLabelNombreTabla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombreTabla.setText("Salas");

        jButtonAgregarPeliculas.setBackground(new java.awt.Color(0, 0, 0));
        jButtonAgregarPeliculas.setForeground(new java.awt.Color(255, 255, 0));
        jButtonAgregarPeliculas.setText("Agregar");

        jButtonEliminarPeliculas.setBackground(new java.awt.Color(0, 0, 0));
        jButtonEliminarPeliculas.setForeground(new java.awt.Color(255, 255, 0));
        jButtonEliminarPeliculas.setText("Eliminar");
        jButtonEliminarPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarPeliculasActionPerformed(evt);
            }
        });

        jButtonVolver.setBackground(new java.awt.Color(0, 0, 0));
        jButtonVolver.setForeground(new java.awt.Color(255, 255, 0));
        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        TablePeliculas.setBackground(new java.awt.Color(0, 0, 0));
        TablePeliculas.setForeground(new java.awt.Color(255, 255, 0));
        TablePeliculas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nombre", "tiempoLimpieza", "Costo", "horaDesocupada", "Capacidad", "nombreSucursal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablePeliculas.setSelectionBackground(new java.awt.Color(204, 204, 204));
        TablePeliculas.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(TablePeliculas);

        btnPaginaAnterior.setBackground(new java.awt.Color(0, 0, 0));
        btnPaginaAnterior.setForeground(new java.awt.Color(255, 255, 0));
        btnPaginaAnterior.setText("Anterior");
        btnPaginaAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaginaAnteriorActionPerformed(evt);
            }
        });

        lblNumeroPagina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumeroPagina.setText("Página 1");
        lblNumeroPagina.setToolTipText("");

        btnPaginaSiguiente.setBackground(new java.awt.Color(0, 0, 0));
        btnPaginaSiguiente.setForeground(new java.awt.Color(255, 255, 0));
        btnPaginaSiguiente.setText("Siguiente");
        btnPaginaSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaginaSiguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelFondoLayout = new javax.swing.GroupLayout(PanelFondo);
        PanelFondo.setLayout(PanelFondoLayout);
        PanelFondoLayout.setHorizontalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBarraCinepolis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(320, 320, 320)
                        .addComponent(jLabelNombreTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonAgregarPeliculas)
                            .addComponent(jButtonVerPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEliminarPeliculas))
                        .addGap(62, 62, 62)
                        .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelFondoLayout.createSequentialGroup()
                                .addComponent(btnPaginaAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPaginaSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE))))
                .addGap(185, 185, 185))
            .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelFondoLayout.createSequentialGroup()
                    .addGap(273, 273, 273)
                    .addComponent(lblNumeroPagina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(274, 274, 274)))
        );
        PanelFondoLayout.setVerticalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addComponent(PanelBarraCinepolis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombreTabla)
                    .addComponent(jButtonVolver))
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelFondoLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jButtonVerPeliculas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAgregarPeliculas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEliminarPeliculas))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelFondoLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPaginaAnterior)
                            .addComponent(btnPaginaSiguiente))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelFondoLayout.createSequentialGroup()
                    .addContainerGap(478, Short.MAX_VALUE)
                    .addComponent(lblNumeroPagina)
                    .addGap(281, 281, 281)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 1047, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEliminarPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarPeliculasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEliminarPeliculasActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        frmMenuAdmin menu = new frmMenuAdmin();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void btnPaginaAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaginaAnteriorActionPerformed
        this.pagina--;
        if (this.pagina == 0) {
            this.pagina = 1;
            return;
        }
        this.establecerTituloPaginacion();
        this.cargarTablaClientes();
    }//GEN-LAST:event_btnPaginaAnteriorActionPerformed

    private void btnPaginaSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaginaSiguienteActionPerformed
        this.pagina++;
        this.establecerTituloPaginacion();
        this.cargarTablaClientes();
    }//GEN-LAST:event_btnPaginaSiguienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBarraCinepolis;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JTable TablePeliculas;
    private javax.swing.JButton btnPaginaAnterior;
    private javax.swing.JButton btnPaginaSiguiente;
    private javax.swing.JButton jButtonAgregarPeliculas;
    private javax.swing.JButton jButtonEliminarPeliculas;
    private javax.swing.JButton jButtonVerPeliculas;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabelCinepolis;
    private javax.swing.JLabel jLabelConfigAdmin;
    private javax.swing.JLabel jLabelNombreTabla;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNumeroPagina;
    // End of variables declaration//GEN-END:variables
}
