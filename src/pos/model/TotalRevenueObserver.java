/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos.model;

/**
 * Observes the total amount paid for purchases since the program started. 
 * @author Josh
 */
public interface TotalRevenueObserver {
    /**
     * Will be called when a sale change is made. 
     * @param totalRevenue 
     */
    void newTotalRevenue(double totalRevenue);
     
    
}
