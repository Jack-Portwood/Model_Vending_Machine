package Coins;

public class Coin {

    private CoinType type;

    public Coin(CoinType type){
        this.type = type;
    }

    public int coinType(){
        return type.coinVal();
    }

}
