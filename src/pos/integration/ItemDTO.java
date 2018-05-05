/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos.integration;

/**
 *
 * @author Josh
 */
public class ItemDTO {
    private final int itemIdentification;
    private final String itemDes;
    private final double price;
    
    
    public ItemDTO(int itemIdentification,String itemDes, double price) {
        this.itemIdentification = itemIdentification;
        this.itemDes = itemDes;
        this.price = price;
    }
    public int getItemIdentification() {
        return itemIdentification;
    }
    
    public String getItemDes() {
        return itemDes;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String toString() {
        return itemDes + "\n" + price;
    }
    
}
