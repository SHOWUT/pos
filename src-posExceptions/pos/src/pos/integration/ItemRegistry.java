package pos.integration;

import java.util.ArrayList;
import java.util.List;

/**
 * ItemRegistry makes sure the items are valid.
 * @author Josh
 */
public class ItemRegistry {
    private final List<ItemDTO> itemsAvalible = new ArrayList<>(); 
            
    public ItemRegistry() {
        itemsAvalible.add(new ItemDTO(8465, "Sky boots [Increases your jump by 10x.]", 400));
        itemsAvalible.add(new ItemDTO(2638, "All-around potion [Gives +5 on all attributes.]", 555));
        itemsAvalible.add(new ItemDTO(1857, "Bottle of light [Blinds anyone within a radius of 50m.]", 170));
        itemsAvalible.add(new ItemDTO(2857, "Scroll of strength  [A spell that gives you the ability to absorb the strength of defeated enemys.]", 1234.56));
    }
    
 
    
    /**
     * Checks if there is a item that has the same ID number as the parameter. 
     * @param itemID The numbers used to tell what item it is. 
     * @return The itemDTO containing info about the item if it is valid else it returns null.
     */
    public ItemDTO verifyItem(int itemID) {
        for (ItemDTO itemDTO : itemsAvalible) {
            if (itemID == itemDTO.getItemIdentification()) {
                return itemDTO;
            }
        }
        invalidItemID(itemID);
        return null;
    }
    /**
     * Shows that the itemID entered is invalid. 
     * @param itemID The numbers used to tell what item it is. 
     */
    private void invalidItemID(int itemID) {
        System.out.println("Item ID " + itemID + " is invalid.");
    }
    
    
}
