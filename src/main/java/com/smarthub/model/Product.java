package main.java.com.smarthub.model;

public class Product {
    private  int id;
    private  String name;
    private  String category;
    private  double price;
    private  int quantity;

    public Product(){
    };

    public Product(String name,String category,double price,int quantity){
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

}
