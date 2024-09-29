package persistencia.interfaces;

import entidad.Funcion;
import persistencia.excepcion.PersistenciaException;

/**
 *
 * @author Brandon Valenzuela
 */
public interface IFuncionDAO {
    
    public void agregarFuncion(Funcion funcion) throws PersistenciaException;
    
    public void eliminarFuncion(int idFuncion) throws PersistenciaException;
    
    public Funcion obtenerFuncionID(int idFuncion) throws PersistenciaException;
    
    public void actualizarFuncion(Funcion funcion) throws PersistenciaException;
}
