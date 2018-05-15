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
    private ItemDTO itemThatCanNotBeRegistered;
    
    /**
     * WRITE COMM
     * @param itemThatCanNotBeRegistered 
     */
    public InvalidIDException(ItemDTO itemThatCanNotBeRegistered) {
        super("Unable to register item with itemID " + itemThatCanNotBeRegistered.getItemIdentification() + "since it doesn't exist "
                + "in the item registry.");
        this.itemThatCanNotBeRegistered = itemThatCanNotBeRegistered;
    }
    
    /**
     * WRITE COMM
     * @return 
     */
    public ItemDTO getItemThatCanNotBeRegistered() {
        return itemThatCanNotBeRegistered;
    }
    
    
    
    
    
    
    
    
    
}
