package pos.controller;

import pos.model.Sale;
import pos.integration.ItemRegistry;
import pos.integration.ItemDTO;


/**
 * Only controller in the application. All calls to the model pass through here.
 * 
 * @author Josh
 */
public class Controller {
    private Sale sale;
    private String validItemID;
    private ItemRegistry itemRegistry;
    private ItemDTO itemDTO;
    
    /**
     * Creates an empty instance of {@link Sale}, which will be used for all information regarding
     * the sale that is now started.
     */
    public void startSale() {
        sale = new Sale();
        itemRegistry = new ItemRegistry();
        
    }
    
    /**
     *
     * @param itemID
     * @param quantityNum
     * @return
     */
    public String identifyItem(int itemID) {
        validItemID = itemRegistry.checkItemID(itemID);//validItemID är en string som säger "valid item" / "invalid item"
       /* if (validItemID.equals("Item ID is invalid")) {
            return validItemID;
        }
        else
        */
            return validItemID;
            
    }
    // PUBLIC SALEDTO WAS BEFORE .................. --------- 
    public ItemDTO identifyAndRegItem(int itemID) {
         itemDTO = itemRegistry.verifyItem(itemID);
         if (itemDTO == null) {
            return null;
        }
         else {
             sale.addItem2Sale(itemDTO);
             sale.runningTotal();
         }
         
         return itemDTO;
             
    }
    
    public double fetchTotal() {
        return sale.totalWithTax();
    }
}
