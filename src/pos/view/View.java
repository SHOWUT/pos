package pos.view;

import pos.controller.Controller;
import pos.integration.ItemDTO;

/**
 * This is a placeholder for the view. It contains only hard-coded calls to the controller.
 * 
 * @author Josh
 */
public class View {
    private Controller contr;
    private String testPrint;
    
    
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
        //SaleInfo saleInfo = contr.identifyItem(1234, 2); //itemid n quanNUm , tänk på inga odef num anv stora bokstäver
        /*testPrint = contr.identifyItem(8465);
        System.out.println(testPrint);
         testPrint = contr.identifyItem(2638);
        System.out.println(testPrint);
        testPrint = contr.identifyItem(1234);
        System.out.println(testPrint);
        */
        ItemDTO temp = contr.identifyAndRegItem(8465); // latest test. 
        System.out.println(temp);
        ItemDTO aa = contr.identifyAndRegItem(1857); // latest test. 
        System.out.println(aa);
        ItemDTO nn = contr.identifyAndRegItem(1212); // latest test. 
        System.out.println(nn);
        double dTotal = contr.fetchTotal();
        System.out.println("Total inc tax: " + dTotal + " gold");
    }
    
}
