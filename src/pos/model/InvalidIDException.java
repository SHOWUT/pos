/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos.model;

import pos.integration.ItemDTO;

/**
 * Thrown when search has been made for item identifier that did not exist in the inventory catalog. 
 * @author Josh
 */
public class InvalidIDException extends Exception {
    private ItemDTO itemThatCanNotBeRegistered; // dont need this, not using itemDTO here?
    
    /**
     * Creates an instance with a message specifying for which item that could not be registered. 
     * @param itemThatCanNotBeRegistered The item that could not be registered. 
     */
    public InvalidIDException(int itemThatCanNotBeRegistered) {
        super("Unable to register item with itemID #" + itemThatCanNotBeRegistered + " since it doesn't exist "
                + "in the item registry." + "\n");
        
    }
    
    /**
     * dont need this, not using itemDTO here?dont need this, not using itemDTO here?
     * -----------------------------------------------------------------------------------
     * @return The item that could not be registered. 
     */
    public ItemDTO getItemThatCanNotBeRegistered() {
        return itemThatCanNotBeRegistered;
    }
    
    
    
    
    
    
    
    
    
}
