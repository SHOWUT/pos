package pos.model;

import java.time.LocalDateTime;

/**
 *
 * @author Josh
 * 
 * Collects all info regarding a particular sale.
 */
public class Sale {
    private LocalDateTime saleTime;
    /**
     * Creates a new instance, and records the time it was created. 
     * This will be the time recorded on the receipt. 
     */
    public Sale() {
        saleTime = LocalDateTime.now();
    }
    
}
