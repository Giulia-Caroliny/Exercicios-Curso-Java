/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author giuli
 */
public class ContaException extends RuntimeException{

    /**
     * Construtor
     * @param message String - mensagem de erro
     */
    public ContaException(String message) {
        super(message);
    }
    
}
