package pos.view;

import pos.controller.Controller;
import pos.integration.ItemDTO;
import pos.model.SaleDTO;

/**
 * This is a placeholder for the view. It contains only hard-coded calls to the controller.
 * 
 * @author Josh
 */
public class View {
    private final Controller contr;
    private static final double AMOUNT_PAID_BY_CUSTOMER = 2700.56;
    private static final int ITEMID_1 = 8465;
    private static final int ITEMID_2 = 1857;
    // make the same variables for the item ids as amount paid by cust
    
    /**
     * Constructs a new view, using the specified controller.
     * 
     * @param contr This controller will be used for all system operations. 
     */
    public View(Controller contr) {
        this.contr = contr;
    }
    
    /**
     * Simulates a sample execution containing calls to all system operations.
     */
    public void sampleExecution() {
        System.out.println("Starting sample execution.");
        contr.startSale();
        System.out.println("After call to startSale().");
        ItemDTO itemDTO_sample = contr.identifyAndRegItem(ITEMID_1);  
        System.out.println(itemDTO_sample);
        ItemDTO itemDTO_sample2 = contr.identifyAndRegItem(ITEMID_2); 
        System.out.println(itemDTO_sample2);
        double dTotal = contr.fetchTotal();
        System.out.println("Total [Inc 25 % tax]: " + dTotal + " gold");
       contr.payment(AMOUNT_PAID_BY_CUSTOMER, dTotal); 
        SaleDTO kvittoSample = contr.getSaleDTO();
        System.out.println(kvittoSample);
    }
    
}
