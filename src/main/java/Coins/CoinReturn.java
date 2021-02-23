package Coins;

import java.util.ArrayList;

public class CoinReturn {

    private ArrayList<Coin> coins;

    public CoinReturn(){
        this.coins = new ArrayList<Coin>();
    }


    public int size(){
        return this.coins.size();
    }

    public void add(Coin item){
         this.coins.add(item);
    }

    public int countTotal(){
        int total = 0;
        for(Coin coin : coins){
            total += coin.coinType();
        }
        return total;
    }




}
