package pos.integration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Josh
 */
public class ItemRegistryTest {
    private Integer itemIDZero;
    private Integer itemIDNeg;
    private Integer itemIDShort;
    private Integer itemIDLong;
    private Integer itemIDCorrect;
    private ItemDTO boots; 
    
    
    
    
    
    @Before
    public void setUp() {
        itemIDZero = 0;
        itemIDNeg = -1234;
        itemIDShort = 12;
        itemIDLong = 12345;
        itemIDCorrect = 8465;
        boots = new ItemDTO(8465, "Sky boots [Increases your jump by 10x.]", 400);
    }
    
    @After
    public void tearDown() {
        itemIDZero = null;
        itemIDNeg = null;
        itemIDShort = null;
        itemIDLong = null;
        itemIDCorrect = null;
        boots = null;
    }

    
    
    @Test
    public void testVerifyItemZero() {
        ItemRegistry instance = new ItemRegistry();
        ItemDTO expResult = null;
        ItemDTO result = instance.verifyItem(itemIDZero);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerifyItemNeg() {
         ItemRegistry instance = new ItemRegistry();
        ItemDTO expResult = null;
        ItemDTO result = instance.verifyItem(itemIDNeg);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerifyItemShort() {
         ItemRegistry instance = new ItemRegistry();
        ItemDTO expResult = null;
        ItemDTO result = instance.verifyItem(itemIDShort);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerifyItemLong() {
         ItemRegistry instance = new ItemRegistry();
        ItemDTO expResult = null;
        ItemDTO result = instance.verifyItem(itemIDLong);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerifyItemCorrect() {
         ItemRegistry instance = new ItemRegistry();
        //ItemDTO expResult = boots;
        ItemDTO result = instance.verifyItem(itemIDCorrect);
       // assertEquals(expResult, result);
        assertNotNull(result);
    }
    
}
