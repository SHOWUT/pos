package pos.data;

import java.util.ArrayList;
import java.util.List;
import pos.model.SaleDTO;

/**
 * A made up external accounting system.
 * @author Josh
 */
public class ExtAccountingSystem {
    private final List<SaleDTO> accountingSystem = new ArrayList<>();
    
   public void add2AccountingSystem(SaleDTO saleDTO) {
        accountingSystem.add(saleDTO);
    }
}
