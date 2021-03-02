import Coins.Coin;
import Coins.CoinReturn;
import Coins.CoinType;
import Drawers.Code;
import Drawers.Drawer;
import Products.Product;

import java.util.ArrayList;

public class VendingMachine {

    private ArrayList<Drawer> drawers;
    private double credit;
    private CoinReturn coinReturn;

    public VendingMachine(ArrayList<Drawer> drawers, CoinReturn coinReturn) {
        this.drawers = drawers;
        this.credit = 0.00;
        this.coinReturn = coinReturn;
    }


    public void addCoin(Coin coin) {
        if (checkCoins(coin)) {
            this.credit += coin.coinValue();
        } else {
            this.coinReturn.add(coin);
        }
    }

    public double getCredit() {
        return credit;
    }

    public CoinReturn getCoinReturn() {
        return coinReturn;
    }

    public boolean checkCoins(Coin coin) {
        return coin.getType() != CoinType.ONE && coin.getType() != CoinType.TWO;
    }

    public Product purchase(Code code){
        for (Drawer drawer : this.drawers) {
            if (code == drawer.code() && this.credit >= drawer.price()) {
                this.credit = 0.0;
                return drawer.vendItem();
            }
        }
        return null;
    }

    public void calculateChange() {
        if (this.credit >= 0) {
            while (credit > 1.00) {
                this.coinReturn.add(new Coin(CoinType.ONEPOUND));
                this.credit -= 1.0;
            }
            while (credit >= 0.5) {
                this.coinReturn.add(new Coin(CoinType.FIFTY));
                this.credit -= 0.5;
            }

            while (credit >= 0.2) {
                this.coinReturn.add(new Coin(CoinType.TWENTY));
                this.credit -= 0.2;
            }

            while (credit >= 0.1) {
                this.coinReturn.add(new Coin(CoinType.TEN));
                this.credit -= 0.1;
            }

            while (credit >= 0.05) {
                this.coinReturn.add(new Coin(CoinType.FIVE));
                this.credit -= 0.05;
            }
        }
    }





}




