import Products.Crisp;
import Products.Drink;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrinkTest {

    Drink drink;

    @Before

    public void before(){
        drink = new Drink("Juice-Juicy", "Sweet-Drank-Co");
    }

    @Test
    public void getName(){
        assertEquals("Juice-Juicy", drink.name());
    }

    @Test
    public void getBrand(){
        assertEquals("Sweet-Drank-Co",drink.brand());
    }
}
