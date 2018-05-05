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
        itemsAvalible.add(new ItemDTO("Flour [2kg]", 1.49));
        itemsAvalible.add(new ItemDTO("Milk [1L, 3% fat]", 1.12));
        itemsAvalible.add(new ItemDTO("Eggs [6-pack]", 1.6));
        itemsAvalible.add(new ItemDTO("Butter [500g]", 3.3));
    }
    
    public String checkItemID(itemID) {
        
    }
    
    
}
