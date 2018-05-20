/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos.model;

import java.util.ArrayList;
import java.util.List;

/**
 * The observed class. 
 * @author Josh
 */
public class TotalRevenue {
    private List<TotalRevenueObserver> totalRevenueObservers = new ArrayList<>();
    private double totalRevenue = 0;
    
    /**
     * Total revenue gets added and observes gets notified. 
     * @param total The total revenue. 
     */
    public void revenue (double total) {
        totalRevenue = totalRevenue + total; 
        notifyObservers();
    }
    
    /**
     * 
     * @param obs The observer 
     */
    public void addTotalRevenueObserver(TotalRevenueObserver obs) {
        totalRevenueObservers.add(obs);
    }
    
    /**
     * Notifying observers.
     */
    private void notifyObservers() {
        for (TotalRevenueObserver obs : totalRevenueObservers) {
            obs.newTotalRevenue(totalRevenue);
        }
    }
}
