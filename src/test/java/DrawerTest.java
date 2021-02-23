import Drawers.Code;
import Drawers.Drawer;
import Products.Crisp;
import Products.Drink;
import Products.Sweet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrawerTest {

    Drawer drawer;
    Crisp crisp;
    Drawer drawerA2;
    Drink drink;
    Drawer drawerA3;
    Sweet sweet;

    @Before

    public void before(){
        drawer = new Drawer(Code.A1, 50);
        crisp = new Crisp("Munch Crunch", "Daves");
        drawerA2 = new Drawer(Code.A2, 100);
        drink = new Drink("Juice-Juicy", "Sweet-Drank-Co");
        drawerA3 = new Drawer(Code.A3, 65);
        sweet = new Sweet("Chocy-Choc", "Sweet-Bar-Co");



    }

    @Test
    public void getCode(){
        assertEquals(Code.A1, drawer.code());
    }

    @Test
    public void getPrice(){
        assertEquals(50, drawer.price());
    }

    @Test
    public void getSize(){
        assertEquals(0,drawer.size());
    }

    @Test
    public void addItem(){
        assertEquals(0,drawer.size());
        drawer.add(crisp);
        assertEquals(1,drawer.size());
    }

    @Test
    public void VendItem(){
        assertEquals(0,drawer.size());
        drawer.add(crisp);
        assertEquals(crisp,drawer.vendItem());

    }
}
