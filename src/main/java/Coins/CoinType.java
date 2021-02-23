package Coins;

public enum CoinType {

    ONE(1),
    TWO(2),
    TEN(10),
    TWENTY(20),
    FIFTY(50),
    ONEPOUND(100);

    private int coinVal;

     CoinType( int coinVal){
        this.coinVal = coinVal;
    }

    public int coinVal(){
         return coinVal;
    }




}
