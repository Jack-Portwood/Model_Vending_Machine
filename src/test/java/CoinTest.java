import Coins.Coin;
import Coins.CoinType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinTest {

    Coin coin;

    @Before

    public void before(){
        coin = new Coin(CoinType.FIFTY);
    }

    @Test
    public void getCoinType(){
        assertEquals(50,coin.coinType());
    }
}
