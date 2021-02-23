package Products;

public abstract class Product {

    private String name;
    private String brand;

    public Product(String name, String brand){
        this.name = name;
        this.brand = brand;
    }

    public String name(){
        return this.name;
    }

    public String brand(){
        return this.brand;
    }


}
