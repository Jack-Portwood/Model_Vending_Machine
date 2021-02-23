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

    public Code code(){
        return this.code;
    }

    public int price(){
        return this.price;
    }

    public int size(){
        return items.size();
    }

    public void add(Product item){
         this.items.add(item);
    }

    public Product vendItem(){
        return this.items.remove(0);
    }







}
