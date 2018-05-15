package pos.model;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import pos.integration.ItemDTO;

/**
 *
 * @author Josh
 */
public class SaleInfoTest {
    private static List<ItemDTO> itemCart = new ArrayList<>(); 
    private ItemDTO itemDTO = new ItemDTO(8465, "Sky boots [Increases your jump by 10x.]", 400);
    

    /**
     * Test of addItem2Cart method, of class SaleInfo.
     */
    @Test
    public void testAddItem2Cart() {
        ItemDTO itemDTO = new ItemDTO(8465, "Sky boots [Increases your jump by 10x.]", 400);
        SaleInfo instance = new SaleInfo();
        instance.addItem2Cart(itemDTO);
        assertNotNull(itemCart);
    }

    /**
     * Test of getItemCart method, of class SaleInfo.
     */
    @Test
    public void testGetItemCart() {
        SaleInfo instance = new SaleInfo();
        List<ItemDTO> expResult = itemCart;
        List<ItemDTO> result = instance.getItemCart();
        assertEquals(expResult, result);
    }
    

    /**
     * Test of runningTotal method, of class SaleInfo.
     */
    @Test
    public void testRunningTotal() {
        System.out.println("runningTotal");
        SaleInfo instance = new SaleInfo();
        instance.runningTotal();
        double runningTotalCorrect = 400;
        assertEquals(runningTotalCorrect, itemDTO.getPrice(), 0);
    }
    

    
    /**
     * Test of totalWithTax method, of class SaleInfo.
     */
    
    @Test
    public void testTotalWithTax() {
        SaleInfo instance = new SaleInfo();
        double expResult = 500;
        double result = instance.totalWithTax();
    }
    
}
