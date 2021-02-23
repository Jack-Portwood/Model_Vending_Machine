import Products.Drink;
import Products.Sweet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SweetTest {

    Sweet sweet;

    @Before

    public void before(){
        sweet = new Sweet("Chocy-Choc", "Sweet-Bar-Co");
    }

    @Test
    public void getName(){
        assertEquals("Chocy-Choc", sweet.name());
    }

    @Test
    public void getBrand(){
        assertEquals("Sweet-Bar-Co",sweet.brand());
    }
}
