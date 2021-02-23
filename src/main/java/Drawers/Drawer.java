package Drawers;

import Products.Product;

import java.util.ArrayList;

public class Drawer {

    private Code code;
    private int price;
    private ArrayList<Product> items;

    public Drawer(Code code, int price){
        this.code = code;
        this.price = price;
        this.items = new ArrayList<Product>();
    }



}
