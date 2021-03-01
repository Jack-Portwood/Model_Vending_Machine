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

    public void add(Coin coin){
         this.coins.add(coin);
    }

    public double countTotal(){
        double total = 0.0;
        for(Coin coin : this.coins){
            total += coin.coinValue();
        }
        return total;
    }




}
