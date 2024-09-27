/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author Alberto Palma
 */
public class NegocioException extends Exception{
    /**
     * Construye la excepción del negocio
     * @param msj el mensaje
     */
    public NegocioException(String msj){
        super(msj);
    }
}
