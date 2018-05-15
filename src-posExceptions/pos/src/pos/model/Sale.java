package pos.model;

import java.time.LocalDateTime;
import pos.integration.ItemDTO;

/**
 * Collects all info regarding a particular sale.
 * 
 * @author Josh
 */
public class Sale {
    private final LocalDateTime saleTime;
    private final SaleInfo saleInfo = new SaleInfo();
    
    /**
     * Creates a new instance, and records the time it was created. 
     * This will be the time recorded on the receipt. 
     */
    public Sale() {
        saleTime = LocalDateTime.now();
    }
    
    /**
     * Registers the item the customer wants to purchase in their item cart.
     * @param itemDTO The item that the customer wants to buy.
     */
    public void addItem2Sale(ItemDTO itemDTO) {
        saleInfo.addItem2Cart(itemDTO);
    }
    
    /**
     * Forwards the action of finding out the running total to saleInfo. 
     */
    public void runningTotal() {
       saleInfo.runningTotal();
    }
    
    /**
     * Forwards the action of showing the running total to saleInfo.
     */
    public void showRunningTotal() {
        saleInfo.showRunningTotal();
    }
    /**
     * 
     * @return The cost of all items the customer buys with tax included.
     */
    public double totalWithTax() {
        return saleInfo.totalWithTax();
    }
    
    
}
