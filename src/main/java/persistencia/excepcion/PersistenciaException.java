/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia.excepcion;

/**
 *
 * @author Alberto Palma
 */
public class PersistenciaException extends Exception{
    /**
     * Construye la excepción de persistencia
     * @param msj el mensaje
     */
    public PersistenciaException(String msj){
        super(msj);
    }
}
