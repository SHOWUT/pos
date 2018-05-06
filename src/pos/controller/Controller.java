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
    private ItemRegistry itemRegistry;
    private ItemDTO itemDTO;
    private SaleDTO saleDTO;
    private final Payment payment = new Payment(saleDTO); 
    
    /**
     * Creates an empty instance of {@link Sale}, which will be used for all information regarding
     * the sale that is now started.
     */
    public void startSale() {
        sale = new Sale();
        itemRegistry = new ItemRegistry();
        
    }
    
 
    /**
     * Will register a valid item to the customers cart. 
     * @param itemID The numbers used to identify each item. 
     * @return itemDTO that holds details about the item. 
     */
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
    
    /**
     * 
     * @return The total cost of all items purchased including tax
     */
    public double fetchTotal() {
        return sale.totalWithTax();
    }
    
    
    /**
     * 
     * @param amount The amount of gold given by the customer.
     * @param dtotal The total cost of all items including tax.
     */
    public void payment (double amount, double dtotal) {
         payment.payNChange(amount, dtotal);
    }
    
    /**
     * 
     * @return The saleDTO containing the info on the receipt.
     */
    public SaleDTO getSaleDTO(){
        return payment.getSaleDTO();
    }
}
