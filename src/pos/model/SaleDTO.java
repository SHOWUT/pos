/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos.model;

import pos.model.Sale;
import pos.model.SaleInfo;
import java.time.LocalDateTime;
import java.util.List;
import pos.integration.ItemDTO;
/**
 * KVITTO, VILL HA MED SALE TIME, TOTAL W TAX, ALLA ITEMS MED DETALJER 
 * @author Josh
 */
public class SaleDTO {
    private final LocalDateTime saleTime;
    private final List<ItemDTO> itemCart;
    private final double totalWTax;
    // nedan är test addioner
    private final double amount;
    private final double change;

    // taking away , double totalWTax, double amount, double change
    public SaleDTO(LocalDateTime saleTime, List<ItemDTO> itemCart, double totalWTax, double amount, double change) {
        this.saleTime = saleTime;
        this.itemCart = itemCart;
        this.totalWTax = totalWTax;
        this.amount = amount;
        this.change = change;
    }

    
    
    public LocalDateTime getSaleTime() {
        return saleTime;
    }
    
    public List<ItemDTO> getItemCart() {
        return itemCart;
    }
    
    
    public double getTotalWTax() {
        return totalWTax;
    }
    
    
    
    public double getAmount() {
        return amount;
    }
    
    
    
    public double getChange() {
        return change;
    }

    //double totalWTax, double amount, double change
    public String toString() {
        return ">-RECEIPT-<" + "\n" + "Time & date: " + saleTime + "\n" + "Items: " + itemCart + 
                "\n" + "Total [Inc 25 % tax]: " + totalWTax + "\n" + "Amount given: " + amount + "\n" + "Change: "+ change;
    }
}
