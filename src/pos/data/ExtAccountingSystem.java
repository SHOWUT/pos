/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos.data;

import java.util.ArrayList;
import java.util.List;
import pos.model.SaleDTO;

/**
 *
 * @author Josh
 */
public class ExtAccountingSystem {
    private final List<SaleDTO> accountingSystem = new ArrayList<>();
    
   public void add2AccountingSystem(SaleDTO saleDTO) {
        accountingSystem.add(saleDTO);
    }
}
