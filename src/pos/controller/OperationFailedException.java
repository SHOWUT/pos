/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos.controller;

/**
 * Thrown when an operation fails, an the reason is unknown. 
 * @author Josh
 */
public class OperationFailedException extends Exception{
    /**
     * Creates a new instance with the specified message.
     * @param message The exception message. 
     */
    public OperationFailedException(String message) {
        super(message);
    }
}
