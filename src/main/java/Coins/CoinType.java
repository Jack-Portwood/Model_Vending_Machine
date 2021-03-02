package Coins;

public enum CoinType {

    ONE(0.01),
    TWO(0.02),
    FIVE(0.05),
    TEN(0.10),
    TWENTY(0.20),
    FIFTY(0.50),
    ONEPOUND(1.00);

    private double coinVal;

     CoinType( double coinVal){
        this.coinVal = coinVal;
    }

    public double coinVal(){
         return coinVal;
    }




}
