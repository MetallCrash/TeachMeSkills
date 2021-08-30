package Shop;

import java.time.LocalTime;

public class Product {
    private int id;
    private String name;
    private int price;
    private final LocalTime subsequence = LocalTime.now();


    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalTime getSubsequence() {
        return subsequence;
    }

    @Override
    public String toString() {
        return "ID товара: " + id + "   Название товара: " + name + "   Цена: " + price;
    }

    @Override
    public boolean equals(Object obj) {
        Product product = (Product) obj;
        return id == product.id;
    }
}
