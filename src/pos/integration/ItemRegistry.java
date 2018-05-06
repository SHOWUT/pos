package pos.integration;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Josh
 */
public class ItemRegistry {
    private final List<ItemDTO> itemsAvalible = new ArrayList<>(); // hur funkar listor? z
            
    public ItemRegistry() {
        itemsAvalible.add(new ItemDTO(8465, "Sky boots [Increases your jump by 10x.]", 400));
        itemsAvalible.add(new ItemDTO(2638, "All-around potion [Gives +5 on all attributes.]", 555));
        itemsAvalible.add(new ItemDTO(1857, "Bottle of light [Blinds anyone within a radius of 50m.]", 170));
        itemsAvalible.add(new ItemDTO(2857, "Scroll of strength  [A spell that gives you the ability to absorb the strength of defeated enemys.]", 1234.56));
    }
    
    public String checkItemID(int itemID) {
        for (ItemDTO itemDTO : itemsAvalible) {
            if (itemID == itemDTO.getItemIdentification()) {
                return itemDTO.toString();
            }
        }
        return "Item ID " +itemID + " is invalid";
    }
    // new
    /**
     * 
     * @param itemID
     * @return 
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
     * 
     * @param itemID 
     */
    private void invalidItemID(int itemID) {
        System.out.println("Item ID " + itemID + " is invalid.");
    }
    
    
}
