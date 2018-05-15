package pos.integration;

/**
 * DTO for valid items. 
 * @author Josh
 */
public class ItemDTO {
    private final int itemIdentification;
    private final String itemDes;
    private final double price;
    
    /**
     * 
     * @param itemIdentification The numbers used to tell what item it is.
     * @param itemDes The text that describes the item.
     * @param price The cost of the item.
     */
    public ItemDTO(int itemIdentification,String itemDes, double price) {
        this.itemIdentification = itemIdentification;
        this.itemDes = itemDes;
        this.price = price;
    }
    
    /**
     * 
     * @return The numbers used to tell what item it is.
     */
    public int getItemIdentification() {
        return itemIdentification;
    }
    
    /**
     * 
     * @return The text that describes the item.
     */
    public String getItemDes() {
        return itemDes;
    }
    
    /**
     * 
     * @return The cost of the item.
     */
    public double getPrice() {
        return price;
    }
    
    /**
     * 
     * @return Information about the item displayed nicely.
     */
    public String toString() {
        return "#" + itemIdentification + "\t" + itemDes + "\t" + price + " gold" + "\n";
    }
    
}
