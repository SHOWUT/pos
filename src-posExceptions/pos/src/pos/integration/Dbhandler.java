package pos.integration;

import pos.model.SaleDTO;
import pos.data.ExtAccountingSystem;
import pos.data.ExtInventorySystem;
/**
 * Calls to external systems pass through here.
 * @author Josh
 */
public class Dbhandler {
    private final ExtAccountingSystem extAccountingSystem = new ExtAccountingSystem();
    private final ExtInventorySystem extInventorySystem = new ExtInventorySystem();
    
    /**
     * Sends info to external accounting system.
     * @param saleDTO The info about the sale.
     */
    public void sendInfoAS(SaleDTO saleDTO) {
     extAccountingSystem.add2AccountingSystem(saleDTO); 
    }
    
    /**
     * Sends info to external inventory system.
     * @param saleDTO The info about the sale.
     */
    public void sendInfoIS(SaleDTO saleDTO) {
     extInventorySystem.add2InventorySystem(saleDTO);
    }
}
