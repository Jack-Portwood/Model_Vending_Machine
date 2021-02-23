import Products.Crisp;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CrispTest {

    Crisp crisp;

    @Before

    public void before(){
        crisp = new Crisp("Munch Crunch", "Daves");
    }

    @Test
    public void getName(){
        assertEquals("Munch Crunch", crisp.name());
    }

    @Test
    public void getBrand(){
        assertEquals("Daves",crisp.brand());
    }
}
