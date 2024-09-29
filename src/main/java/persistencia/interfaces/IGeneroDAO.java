/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia.interfaces;

import entidad.Genero;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Brandon Valenzuela
 */
public interface IGeneroDAO {
    
    public void agregarGenero(Genero genero) throws SQLException;
    
    public List<Genero> obtenerGeneros() throws SQLException;
    
}
