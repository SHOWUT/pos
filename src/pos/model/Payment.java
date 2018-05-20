package pos.model;

import java.time.LocalDateTime;
import java.util.List;
import pos.integration.Dbhandler;
import pos.integration.ItemDTO;


/**
 * Takes care of all the payment details.
 * @author Josh
 */
public class Payment {
    private final SaleDTO saleDTO;
    private double change;
    private final Dbhandler dbhandler = new Dbhandler();
    private double theTotal;
    private double theAmount;
    private final SaleInfo saleInfo = new SaleInfo();

    public Payment(SaleDTO saleDTO) {
        this.saleDTO = saleDTO;
    }
    
    /**
     * Helps figure out the change and sends information about the sale forward to dbhandler. 
     * @param amount The gold the customer gave.
     */
    public void payNChange(double amount) {
        saleInfo.runningTotal();
        theTotal = saleInfo.totalWithTax(); 
        theAmount = amount;
        change = amountOfChange(theAmount, theTotal);
        dbhandler.sendInfoAS(saleDTO);
        dbhandler.sendInfoIS(saleDTO);
    }
    
    
    /**
     * Calculates the change.
     * @param amount The gold the customer gave.
     * @param dtotal The total cost of the customers items.
     * @return The quantity of change that the customer should receive.
     */
    private double amountOfChange(double amount, double total) {
        return amount - total;
    }
    
    
    
    /**
     * initializes the making of a new SaleDTO.
     * @return SaleDTO containing all the info about the sale
     */
    public SaleDTO getSaleDTO() {
        List<ItemDTO> itemCart = saleInfo.getItemCart();
        return new SaleDTO(LocalDateTime.now(), itemCart, theTotal, theAmount, change);
    }
}
