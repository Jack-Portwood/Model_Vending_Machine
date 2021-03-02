import Coins.Coin;
import Coins.CoinReturn;
import Coins.CoinType;
import Drawers.Code;
import Drawers.Drawer;
import Products.Crisp;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class VendingMachineTest {

    Coin coin1;
    Coin coin2;
    Coin coin3;
    Coin coin4;
    Drawer drawer;
    CoinReturn coinReturn;
    VendingMachine vendingMachine;
    Crisp crisp;


    @Before
    public void before(){

        coin1 = new Coin(CoinType.TEN);
        coin2 = new Coin(CoinType.TWENTY);
        coin3 = new Coin(CoinType.ONE);
        coin4 = new Coin(CoinType.FIFTY);
        drawer = new Drawer(Code.A1,0.30);
        crisp = new Crisp("Munch Crunch", "Daves");
        drawer.add(crisp);
        ArrayList<Drawer> drawers = new ArrayList<Drawer>();
        drawers.add(drawer);
        coinReturn = new CoinReturn();
        vendingMachine = new VendingMachine(drawers,coinReturn);


    }


    @Test
    public void acceptsCoins(){
        vendingMachine.addCoin(coin1);
        assertEquals(0.10, vendingMachine.getCredit(), 0.01);
    }

    @Test
    public void returnInvalidCoin(){
        vendingMachine.addCoin(coin3);
        assertEquals(0.01,vendingMachine.getCoinReturn().countTotal(), 0.01);
    }

    @Test
    public void canBuyProduct(){
        vendingMachine.addCoin(coin1);
        vendingMachine.addCoin(coin2);
        Crisp item = (Crisp)vendingMachine.purchase(Code.A1);
        assertEquals("Munch Crunch", item.name());
        assertEquals(0.00, vendingMachine.getCredit(), 0.01);
    }

    @Test
    public void notEnoughMoney(){
        vendingMachine.addCoin(coin2);
        Crisp crisp = (Crisp)vendingMachine.purchase(Code.A1);
        System.out.println("No Enough Money ken");
        assertNull(crisp);

    }

    @Test
    public void canCaluculateChange(){
        vendingMachine.addCoin(coin4);
        vendingMachine.calculateChange();
        assertEquals(0.50, vendingMachine.getCoinReturn().countTotal(),0.01);

    }


}
