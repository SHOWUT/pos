package pos.view;

import pos.controller.Controller;

/**
 * This is a placeholder for the view. It contains only hard-coded calls to the controller.
 * 
 * @author Josh
 */
public class View {
    private Controller contr;
    
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
        SaleInfo saleInfo = contr.identifyItem(1234, 2); //itemid n quanNUm , tänk på inga odef num anv stora bokstäver
        
    }
    
}
