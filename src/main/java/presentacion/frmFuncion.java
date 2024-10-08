/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author joelr
 */
public class frmFuncion extends javax.swing.JFrame {
    int num;
    /**
     * Crea el form frmFuncion
     * Pide un atributo int para mostrar los datos de la pelicula elegida.
     */
    public frmFuncion(int pelicula) {
        initComponents();
        posterPelicula(pelicula);
        num=pelicula;
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
        jLabelFuncion = new javax.swing.JLabel();
        jLabelFechaFuncion = new javax.swing.JLabel();
        jLabelHoraFuncion = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        jComboBoxDia = new javax.swing.JComboBox<>();
        jComboBoxMes = new javax.swing.JComboBox<>();
        jLabelDiaMesAño = new javax.swing.JLabel();
        jLabelSala = new javax.swing.JLabel();
        jLabelNombrePelicula = new javax.swing.JLabel();
        jLabelPelicula = new javax.swing.JLabel();
        jComboBoxHora = new javax.swing.JComboBox<>();
        jComboBoxTipoSala = new javax.swing.JComboBox<>();
        jLabelTotal1 = new javax.swing.JLabel();
        jLabelHoraFuncion1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabelEfectivo = new javax.swing.JLabel();
        jLabelTotal2 = new javax.swing.JLabel();
        jLabelTarjeta = new javax.swing.JLabel();
        jButtonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(880, 500));

        PanelFondo.setBackground(new java.awt.Color(0, 0, 0));
        PanelFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelFondo.setPreferredSize(new java.awt.Dimension(600, 600));

        PanelBarraCinepolis.setBackground(new java.awt.Color(51, 51, 255));

        jLabelCinepolis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCinepolis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosPresentacion/IconCinepolis2.png"))); // NOI18N
        jLabelCinepolis.setText("jLabel1");

        jLabelFuncion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelFuncion.setForeground(new java.awt.Color(255, 255, 0));
        jLabelFuncion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFuncion.setText("Función");

        javax.swing.GroupLayout PanelBarraCinepolisLayout = new javax.swing.GroupLayout(PanelBarraCinepolis);
        PanelBarraCinepolis.setLayout(PanelBarraCinepolisLayout);
        PanelBarraCinepolisLayout.setHorizontalGroup(
            PanelBarraCinepolisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBarraCinepolisLayout.createSequentialGroup()
                .addComponent(jLabelCinepolis, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188)
                .addComponent(jLabelFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelBarraCinepolisLayout.setVerticalGroup(
            PanelBarraCinepolisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBarraCinepolisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelCinepolis, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabelFuncion))
        );

        jLabelFechaFuncion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelFechaFuncion.setForeground(new java.awt.Color(255, 255, 0));
        jLabelFechaFuncion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFechaFuncion.setText("Fecha de Función");

        jLabelHoraFuncion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelHoraFuncion.setForeground(new java.awt.Color(255, 255, 0));
        jLabelHoraFuncion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHoraFuncion.setText("Hora de Función");

        jLabelTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelTotal.setForeground(new java.awt.Color(255, 255, 0));
        jLabelTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTotal.setText("Total");

        jComboBoxDia.setBackground(new java.awt.Color(0, 0, 0));
        jComboBoxDia.setForeground(new java.awt.Color(255, 255, 0));
        jComboBoxDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jComboBoxMes.setBackground(new java.awt.Color(0, 0, 0));
        jComboBoxMes.setForeground(new java.awt.Color(255, 255, 0));
        jComboBoxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabelDiaMesAño.setForeground(new java.awt.Color(255, 255, 0));
        jLabelDiaMesAño.setText("Dia: Mes");

        jLabelSala.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelSala.setForeground(new java.awt.Color(255, 255, 0));
        jLabelSala.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSala.setText("Sala");

        jLabelNombrePelicula.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelNombrePelicula.setForeground(new java.awt.Color(255, 255, 0));
        jLabelNombrePelicula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombrePelicula.setText("Nombre de Pelicula");

        jLabelPelicula.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPelicula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPelicula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursosPresentacion/Deadpool3.jpg"))); // NOI18N
        jLabelPelicula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jComboBoxHora.setBackground(new java.awt.Color(0, 0, 0));
        jComboBoxHora.setForeground(new java.awt.Color(255, 255, 0));
        jComboBoxHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hora" }));

        jComboBoxTipoSala.setBackground(new java.awt.Color(0, 0, 0));
        jComboBoxTipoSala.setForeground(new java.awt.Color(255, 255, 0));
        jComboBoxTipoSala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de Sala:" }));

        jLabelTotal1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelTotal1.setForeground(new java.awt.Color(255, 255, 0));
        jLabelTotal1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTotal1.setText("Total:");

        jLabelHoraFuncion1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelHoraFuncion1.setForeground(new java.awt.Color(255, 255, 0));
        jLabelHoraFuncion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHoraFuncion1.setText("Numero de Boletos");

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setForeground(new java.awt.Color(255, 255, 0));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Numero de Boletos:");

        jLabelEfectivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEfectivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursosPresentacion/efectivo.png"))); // NOI18N
        jLabelEfectivo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jLabelTotal2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelTotal2.setForeground(new java.awt.Color(255, 255, 0));
        jLabelTotal2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTotal2.setText("Metodos de Pago");

        jLabelTarjeta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTarjeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursosPresentacion/TarjetaCredito.png"))); // NOI18N
        jLabelTarjeta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));
        jLabelTarjeta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelTarjeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTarjetaMouseClicked(evt);
            }
        });

        jButtonVolver.setBackground(new java.awt.Color(204, 204, 204));
        jButtonVolver.setText("Volver a Inicio");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
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
                        .addGap(38, 38, 38)
                        .addComponent(jLabelPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelFondoLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabelNombrePelicula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                        .addComponent(jLabelHoraFuncion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelFondoLayout.createSequentialGroup()
                                            .addGap(75, 75, 75)
                                            .addComponent(jComboBoxHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabelSala, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelHoraFuncion1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabelFechaFuncion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelFondoLayout.createSequentialGroup()
                                                .addGap(43, 43, 43)
                                                .addComponent(jComboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabelDiaMesAño)))
                                        .addGroup(PanelFondoLayout.createSequentialGroup()
                                            .addGap(32, 32, 32)
                                            .addComponent(jComboBoxTipoSala, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelFondoLayout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelTotal2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(PanelFondoLayout.createSequentialGroup()
                                        .addGap(124, 124, 124)
                                        .addComponent(jLabelEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(PanelFondoLayout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButtonVolver)))
                .addContainerGap(331, Short.MAX_VALUE))
        );
        PanelFondoLayout.setVerticalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addComponent(PanelBarraCinepolis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jButtonVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelPelicula))
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabelNombrePelicula)
                        .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelFondoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelSala)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxTipoSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelFechaFuncion)
                                .addGap(9, 9, 9)
                                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelDiaMesAño))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelHoraFuncion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelHoraFuncion1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelFondoLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabelTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelTotal1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelTotal2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(396, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 1167, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        frmPantallaPrincipal p = new frmPantallaPrincipal(true);
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jLabelTarjetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTarjetaMouseClicked
        frmDatosTarjeta dt = new frmDatosTarjeta(num);
        dt.setVisible(true);
    }//GEN-LAST:event_jLabelTarjetaMouseClicked
/* 
 * Metodo para elegir el poster de la pelicula en base de la pelicula elegida por el usuario.
 */
public void posterPelicula(int pelicula){
    Icon imagen;
    switch(pelicula){
        case 1: //Harry Potter 1
        imagen= new ImageIcon(getClass().getResource("/recursosPresentacion/HarryPotter1.jpg"));
        this.jLabelPelicula.setIcon(imagen);
        break;
        case 2:// Harry Potter 2
        imagen= new ImageIcon(getClass().getResource("/recursosPresentacion/HarryPotter2.jpeg"));
        this.jLabelPelicula.setIcon(imagen);
        break;
        case 3:// Harry Potter 3
        imagen= new ImageIcon(getClass().getResource("/recursosPresentacion/HarryPotter3.jpg"));
        this.jLabelPelicula.setIcon(imagen);
        break;
        case 4:// Deadpool & Wolverine
        imagen= new ImageIcon(getClass().getResource("/recursosPresentacion/Deadpool3.jpg"));
        this.jLabelPelicula.setIcon(imagen);
        break;
        case 5:// Transformers One
        imagen= new ImageIcon(getClass().getResource("/recursosPresentacion/TransformersOne.jpg"));
        this.jLabelPelicula.setIcon(imagen);
        break;
        case 6:// Beetlejuice Beetlejuice
        imagen= new ImageIcon(getClass().getResource("/recursosPresentacion/bettlejuice2.jpg"));
        this.jLabelPelicula.setIcon(imagen);
        break;
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBarraCinepolis;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JComboBox<String> jComboBoxDia;
    private javax.swing.JComboBox<String> jComboBoxHora;
    private javax.swing.JComboBox<String> jComboBoxMes;
    private javax.swing.JComboBox<String> jComboBoxTipoSala;
    private javax.swing.JLabel jLabelCinepolis;
    private javax.swing.JLabel jLabelDiaMesAño;
    private javax.swing.JLabel jLabelEfectivo;
    private javax.swing.JLabel jLabelFechaFuncion;
    private javax.swing.JLabel jLabelFuncion;
    private javax.swing.JLabel jLabelHoraFuncion;
    private javax.swing.JLabel jLabelHoraFuncion1;
    private javax.swing.JLabel jLabelNombrePelicula;
    private javax.swing.JLabel jLabelPelicula;
    private javax.swing.JLabel jLabelSala;
    private javax.swing.JLabel jLabelTarjeta;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JLabel jLabelTotal1;
    private javax.swing.JLabel jLabelTotal2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
