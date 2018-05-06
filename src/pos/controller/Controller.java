package pos.controller;

import pos.model.Sale;
import pos.integration.ItemRegistry;
import pos.integration.ItemDTO;
import pos.model.SaleDTO;
import pos.model.Payment;


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
    private SaleDTO saleDTO;
    private Payment payment;
    
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
    /**
     * Will register a valid item to the customers cart. ???And present item description and running total???? rätt??? 
     * @param itemID The numbers used to identify each item. 
     * @return itemDTO that holds details about the item. 
     */
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
    
    /* ------ THIS WORKZ FOR METD
    // test of how sale reciept can look like 
    public String saleReceipt(double dTotal) {
       // return saleDTO.toString();
       return sale.getSaleDTO(dTotal);
    }
    */
    
    /* WORKZ ------------METOD
    public String payment(double amount) {
        return "Change: " + payment.payNChange(amount);
    }
    */
    
    public void payment (double amount, double dtotal) {
        payment.payNChange(amount, dtotal);
        //
    }
    
    public SaleDTO getSaleDTO(){
        return payment.getSaleDTO();
    }
}
