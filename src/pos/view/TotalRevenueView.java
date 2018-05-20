/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos.view;

import pos.model.TotalRevenueObserver;

/**
 *
 * @author Josh
 */
public class TotalRevenueView implements TotalRevenueObserver{
    
    @Override
    public void newTotalRevenue(double totalRevenue){
        printTotalRevenue(totalRevenue);
    }
    
    /**
     * Shows the total by printing to System.out. 
     * @param totalRevenue The total revenue. 
     */
    public void printTotalRevenue (double totalRevenue) {
        System.out.println("Total revenue: " + totalRevenue);
    }
}
