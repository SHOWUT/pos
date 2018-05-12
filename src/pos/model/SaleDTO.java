package pos.model;


import java.time.LocalDateTime;
import java.util.List;
import pos.integration.ItemDTO;
/**
 * SaleDTO has all the information on the current sale. 
 * @author Josh
 */
public class SaleDTO {
    private final LocalDateTime saleTime;
    private final List<ItemDTO> itemCart;
    private final double totalWTax;
    private final double amount;
    private final double change;

    /**
     * 
     * @param saleTime The time and date the sale was made.
     * @param itemCart The items that the customer wants to purchase.
     * @param totalWTax The cost of all items including tax.
     * @param amount The gold given as payment for the items.
     * @param change The gold that is to be returned to the customer.
     */
    public SaleDTO(LocalDateTime saleTime, List<ItemDTO> itemCart, double totalWTax, double amount, double change) {
        this.saleTime = saleTime;
        this.itemCart = itemCart;
        this.totalWTax = totalWTax;
        this.amount = amount;
        this.change = change;
    }

    
    /**
     * 
     * @return The time and date the sale was made.
     */
    public LocalDateTime getSaleTime() {
        return saleTime;
    }
    
    /**
     * 
     * @return The items that the customer wants to purchase.
     */
    public List<ItemDTO> getItemCart() {
        return itemCart;
    }
    
    /**
     * 
     * @return The cost of all items including tax.
     */
    public double getTotalWTax() {
        return totalWTax;
    }
    
    
    /**
     * 
     * @return The gold given as payment for the items.
     */
    public double getAmount() {
        return amount;
    }
    
    
    /**
     * 
     * @return The gold that is to be returned to the customer.
     */
    public double getChange() {
        return change;
    }

    /**
     * 
     * @return All the sales information displayed neatly, like in a receipt.
     */
    public String toString() {
        return ">-------RECEIPT--------<" + "\n" + "Time & date: " + saleTime + "\n" + "Items: " + itemCart + 
                "\n" + "Total [Inc 25 % tax]: " + totalWTax + "\n" + "Amount given: " + amount + "\n" + "Change: "+ change + 
                "\n" + ">---------------------<";
    }
}
