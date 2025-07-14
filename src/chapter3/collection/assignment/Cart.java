package chapter3.collection.assignment;

import java.util.*;

class Product {

    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

public class Cart{

    private List<Product> cart = new ArrayList<>();

    public void addProduct(Product product){
        cart.add(product);
        System.out.println(product.getName() + "가 장바구니에 추가되었습니다.");
    }













}
