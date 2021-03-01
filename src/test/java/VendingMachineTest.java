import Coins.Coin;
import Coins.CoinType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {

    VendingMachine vendingMachine;
    Coin coin1;
    Coin coin2;
    Coin coin3;

    @Before
    public void before(){

        vendingMachine = new VendingMachine();
        coin1 = new Coin(CoinType.TEN);
        coin2 = new Coin(CoinType.TWENTY);
        coin3 = new Coin(CoinType.ONE);
    }

    @Test
    public void canAddCoin(){
        assertEquals(0, vendingMachine.size());
        vendingMachine.addCoinToMachine(coin1);
        vendingMachine.addCoinToMachine(coin3);
        assertEquals(1,vendingMachine.size());
    }


}
