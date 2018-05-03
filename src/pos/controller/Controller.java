package pos.controller;

import pos.model.Sale;


/**
 * Only controller in the application. All calls to the model pass through here.
 * 
 * @author Josh
 */
public class Controller {
    private Sale sale;
    /**
     * Creates an empty instance of {@link Sale}, which will be used for all information regarding
     * the sale that is now started.
     */
    public void startSale() {
        sale = new Sale();
    }
    
    public String identifyItem(int itemID, int quantityNum) {
        validItemID = checkItemID(itemID);//validItemID är en string som säger "valid item" / "invalid item"
        
    }
}
