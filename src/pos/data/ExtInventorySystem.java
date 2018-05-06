package pos.data;

import java.util.ArrayList;
import java.util.List;
import pos.model.SaleDTO;
/**
 * A made up external inventory system.
 * @author Josh
 */
public class ExtInventorySystem {
    private final List<SaleDTO> inventorySystem = new ArrayList<>();
    
    public void add2InventorySystem(SaleDTO saleDTO) {
        inventorySystem.add(saleDTO);
    }
}
