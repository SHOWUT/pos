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
    private static final int ITEMID_CORRECT = 8465;
    private static final int ITEMID_WRONG = 1111;
    private static final int ITEMID_DATABASE_FAILURE = 1234;
    private ErrorMessageHandler errorMessageHandler = new ErrorMessageHandler();
    
    /**
     * Constructs a new view, using the specified controller.
     * Also creates the observer. 
     * @param contr This controller will be used for all system operations. 
     */
    public View(Controller contr) {
        this.contr = contr;
        contr.addTotalRevenueObserver(new TotalRevenueView());
    }
    
    /**
     * Simulates a sample execution containing calls to all system operations.
     * 
     */
    public void sampleExecution() {
        System.out.println("Starting sample execution.");
        contr.startSale();
        System.out.println("After call to startSale().");
        
        try {
        ItemDTO itemDTOSample = contr.identifyAndRegItem(ITEMID_CORRECT);  
        System.out.println(itemDTOSample);
        errorMessageHandler.showErrorMessage("Trying to register an item with a invalid itemID.");
        ItemDTO itemDTOSample_2 = contr.identifyAndRegItem(ITEMID_WRONG); 
        ItemDTO itemDTODatabaseFailure = contr.identifyAndRegItem(ITEMID_DATABASE_FAILURE);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
        
        double theTotal = contr.fetchTotal(); 
        contr.payment(AMOUNT_PAID_BY_CUSTOMER); 
        SaleDTO kvittoSample = contr.getSaleDTO();
        contr.callTotalRevenue(kvittoSample);
        System.out.println(kvittoSample);
    }
    
}
