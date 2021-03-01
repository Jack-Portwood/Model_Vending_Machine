package Coins;

public class Coin {


    private CoinType type;


    public Coin(CoinType type){
        this.type = type;
    }

    public CoinType getType() {
        return type;
    }

    public double coinValue(){
        return type.coinVal();
    }

}
