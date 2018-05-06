/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos.model;

import java.time.LocalDateTime;
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
     private static final double taxPct = 1.25; // no final======????
    
    void addItem2Cart (ItemDTO itemDTO) {
        itemCart.add(itemDTO);
    }
    
    //helps payment get list
    public List<ItemDTO> getList() {
        return itemCart;
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
        
        System.out.println("Running Total: " + runningTotal); // make method instead !!!!!! better visauls
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
   /* -------- THIS METOD WORKS for nowz
    public String getSaleDTO(double dTotal) {
        return new SaleDTO(LocalDateTime.now(), itemCart, dTotal).toString();
    }
    */
    
    /*
    public SaleDTO getSaleDTO() {
        return new SaleDTO(LocalDateTime.now(), itemCart);
    }
    */
    
}
