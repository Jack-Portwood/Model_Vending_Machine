import Coins.Coin;
import Coins.CoinReturn;
import Coins.CoinType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinReturnTest {

    CoinReturn coinReturn;
    Coin coin1;
    Coin coin2;

    @Before

    public void before(){
        coinReturn =new CoinReturn();
        coin1 = new Coin(CoinType.TEN);
        coin2 = new Coin(CoinType.TWENTY);
    }

    @Test
    public void getSize(){
        assertEquals(0,coinReturn.size());
    }

    @Test
    public void canAdd(){
        assertEquals(0,coinReturn.size());
        coinReturn.add(coin1);
        assertEquals(1,coinReturn.size());
    }

    @Test
    public void totalCoins(){
        coinReturn.add(coin1);
        coinReturn.add(coin2);
        assertEquals(30, coinReturn.countTotal());
    }



}
