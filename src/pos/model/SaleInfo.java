/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos.model;

import java.util.ArrayList;
import java.util.List;
import pos.integration.ItemDTO;

/**
 *
 * @author Josh
 */
public class SaleInfo {
    private final List<ItemDTO> itemCart = new ArrayList<>(); // make list of registered items. 
     private double runningTotal; // cant put final??? 
     private  double totalWithTax; // cant put final?
     private static double taxPct = 1.12; // no final======????
    
    void addItem2Cart (ItemDTO itemDTO) {
        itemCart.add(itemDTO);
    }
    
    /**
     * Adds the cost of all items in the cart. 
     * //@return The total cost of items.
     */
    public void  runningTotal() {
         runningTotal = 0;
        for (ItemDTO itemDTO : itemCart) {
            runningTotal += itemDTO.getPrice();
        }
 {
        
        System.out.println("Running Total: " + runningTotal); // make method instead !!!!!!
        //runningTotal = 0;
        //resetRunningTotal();
        
    }
    }
    
    /**
     * Calculates the total including 12% tax.
     * @return The total cost with tax included. 
     */
    public double totalWithTax() {
       // totalWithTax = runningTotal * 1.12; behöver nog ej denna rad
        return runningTotal * taxPct;
    }
    
    /*
private void resetRunningTotal(){
        runningTotal = 0;
    }
*/
}
