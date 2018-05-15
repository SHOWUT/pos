package pos.model;


import java.util.ArrayList;
import java.util.List;
import pos.integration.ItemDTO;

/**
 * Stores the items the customer wants to buy and handles the costs. 
 * @author Josh
 */
public class SaleInfo {
    public static List<ItemDTO> itemCart = new ArrayList<>(); 
     private double runningTotal; 
     private double total;
     private static final double TAX_PCT = 1.25; 
     
     
    
     /**
      * Puts the item the customer wants to buy in the shopping cart.
      * @param itemDTO The valid item with itemID, a description and a price.
      */
    void addItem2Cart (ItemDTO itemDTO) {
        itemCart.add(itemDTO);
        
    }
    
    
    /**
     * Assists the payment class to get access to the customers item cart.
     * @return The items the customer wants to buy.
     */
    public List<ItemDTO> getItemCart() {
        return itemCart;
    }
    
    
    
    /**
     * Adds up the cost of all items in the cart.
     * 
     */
    public void  runningTotal() {
         runningTotal = 0;
        for (ItemDTO itemDTO : itemCart) {
            runningTotal += itemDTO.getPrice();
        }
      
    }
    
    /**
     * Shows the running total.
     */
    public void showRunningTotal() {
        System.out.println("Running Total: " + runningTotal + "\n" + "<See last added item below>");
    }
    
    /**
     * Calculates the total including 25% tax.
     * @return The total cost with tax included. 
     */
    public double totalWithTax() {
        total = runningTotal * TAX_PCT;
        return total;
    }
    
    
    

    
}
