/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;
import pos.integration.Dbhandler;
import pos.integration.ItemDTO;
import pos.integration.ReceiptPrinter;

/**
 *
 * @author Josh
 */
public class Payment {
    private final SaleDTO saleDTO;
    private double change;
    private final Dbhandler dbhandler = new Dbhandler();
    private final ReceiptPrinter receiptPrinter = new ReceiptPrinter();
    //private final List<ItemDTO> itemCart;
    private double dtotalWTax;
    private double aamount;
    private final SaleInfo saleInfo = new SaleInfo();

    public Payment(SaleDTO saleDTO) {
        this.saleDTO = saleDTO;
    }
    //public double
    public void payNChange(double amount, double dtotal){
        dtotalWTax = dtotal;
        aamount = amount;
        change = changeAmount(amount, dtotal);
        //receiptPrinter.print(saleDTO, dtotal, amount, change);
        dbhandler.sendInfoAS(saleDTO);// check values
        dbhandler.sendInfoIS(saleDTO);// check values
       
    }
    
    private double changeAmount(double amount, double dtotal) {
        return amount - dtotal;
    }
    
    public SaleDTO getSaleDTO() {
        List<ItemDTO> itemCart = saleInfo.getList();
        return new SaleDTO(LocalDateTime.now(), itemCart, dtotalWTax, aamount, change);
    }
}
