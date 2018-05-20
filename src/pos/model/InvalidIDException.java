package pos.model;


/**
 * Thrown when search has been made for item identifier that did not exist in the inventory catalog. 
 * @author Josh
 */
public class InvalidIDException extends Exception {
  
    
    /**
     * Creates an instance with a message specifying for which item that could not be registered. 
     * @param itemThatCanNotBeRegistered The item that could not be registered. 
     */
    public InvalidIDException(int itemThatCanNotBeRegistered) {
        super("Unable to register item with itemID #" + itemThatCanNotBeRegistered + " since it doesn't exist "
                + "in the item registry." + "\n");
        
    }
     
}
