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
   
    private double dtotalWTax;
    private double aamount;
    private final SaleInfo saleInfo = new SaleInfo();

    public Payment(SaleDTO saleDTO) {
        this.saleDTO = saleDTO;
    }
    
    /**
     * Helps figure out the change and sends information about the sale forward to dbhandler. 
     * @param amount The gold the customer gave.
     * @param dtotal The total cost of the customers items.
     */
    public void payNChange(double amount, double dtotal) {
        dtotalWTax = dtotal;
        aamount = amount;
        change = changeAmount(amount, dtotal);
        dbhandler.sendInfoAS(saleDTO);
        dbhandler.sendInfoIS(saleDTO);
    }
    
    
    /**
     * Calculates the change.
     * @param amount The gold the customer gave.
     * @param dtotal The total cost of the customers items.
     * @return The quantity of change that the customer should receive.
     */
    private double changeAmount(double amount, double dtotal) {
        return amount - dtotal;
    }
    
    /**
     * initializes the making of a new SaleDTO.
     * @return SaleDTO containing all the info about the sale
     */
    public SaleDTO getSaleDTO() {
        List<ItemDTO> itemCart = saleInfo.getItemCart();
        return new SaleDTO(LocalDateTime.now(), itemCart, dtotalWTax, aamount, change);
    }
}
