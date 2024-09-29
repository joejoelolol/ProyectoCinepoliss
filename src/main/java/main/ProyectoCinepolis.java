/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import presentacion.frmMenuAdmin;
import presentacion.frmPantallaPrincipal;

/**
 *
 * @author joelr
 */
public class ProyectoCinepolis {

    public static void main(String[] args) {
        frmPantallaPrincipal p = new frmPantallaPrincipal();
        p.setVisible(true);
        frmMenuAdmin admin = new frmMenuAdmin();
        admin.setVisible(true);
    }
}
