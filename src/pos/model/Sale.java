package pos.model;

import java.time.LocalDateTime;
import pos.integration.ItemDTO;

/**
 *
 * @author Josh
 * 
 * Collects all info regarding a particular sale.
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
    
    public void addItem2Sale(ItemDTO itemDTO) {
        saleInfo.addItem2Cart(itemDTO);
    }
    
    public void runningTotal() {
       saleInfo.runningTotal();
    }
    
    public double totalWithTax() {
        return saleInfo.totalWithTax();
    }
    
    /*---------- THIS METOD WORKZ FOR NOWZ COMBO
    public String getSaleDTO(double dTotal) {
        return saleInfo.getSaleDTO(dTotal);
    }
    */
    
    /*
    public SaleDTO getSaleDTO() {
        return saleInfo.getSaleDTO();
    }
    */
}
