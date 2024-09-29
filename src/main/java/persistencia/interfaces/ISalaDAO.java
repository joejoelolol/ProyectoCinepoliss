/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia.interfaces;

import entidad.Sala;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Brandon Valenzuela
 */
public interface ISalaDAO {

    public void agregarSala(Sala sala) throws SQLException;
    
    public List<Sala> obtenerSalas() throws SQLException;
    
}
