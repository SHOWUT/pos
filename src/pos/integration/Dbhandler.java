/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos.integration;

import pos.model.SaleDTO;
import pos.data.ExtAccountingSystem;
import pos.data.ExtInventorySystem;
/**
 *
 * @author Josh
 */
public class Dbhandler {
    private final ExtAccountingSystem extAccountingSystem = new ExtAccountingSystem();
    private final ExtInventorySystem extInventorySystem = new ExtInventorySystem();
    
    public void sendInfoAS(SaleDTO saleDTO) {
     extAccountingSystem.add2AccountingSystem(saleDTO); 
    }
    
    public void sendInfoIS(SaleDTO saleDTO) {
     extInventorySystem.add2InventorySystem(saleDTO);
    }
}
