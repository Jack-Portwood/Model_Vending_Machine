import Coins.Coin;
import Coins.CoinReturn;
import Drawers.Drawer;

import java.awt.image.renderable.ContextualRenderedImageFactory;
import java.util.ArrayList;

public class VendingMachine {

    private ArrayList<Drawer> drawers;
    private ArrayList<Coin> coinsEntered;
    private ArrayList<Coin> coinsReturned;

    public VendingMachine(){
        this.drawers = new ArrayList<Drawer>();
        this.coinsEntered = new ArrayList<Coin>();
        this.coinsReturned = new ArrayList<Coin>();
    }

    public int size(){
        return coinsEntered.size();
    }

    public void addCoinToMachine(Coin item) {
        if (item.coinType() < 10) {
            this.coinsReturned.add(item);
        }else{
            this.coinsEntered.add(item);
        }
    }
}
