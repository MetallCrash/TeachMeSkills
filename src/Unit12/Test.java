package Unit12;

import java.util.Collection;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Product cheese = new Product(3,"Tomato", 15);
        Product tomato = new Product(4,"Cheese", 14);
        Product potato = new Product(5,"Potato", 13);
        Product cake = new Product(3,"cake", 20);
        shop.add(cheese);
        shop.add(tomato);
        shop.add(potato);
        for (Product product : shop.getProductList()) {
            System.out.println(product.getName());
        }
        Collections.sort(shop.getProductList());
        for (Product product : shop.getProductList()) {
            System.out.printf("Имя товара: %s, Цена товара: %d\n",product.getName(),product.getPrice());
        }
        shop.remove(5);
        Collections.sort(shop.getProductList());
        for (Product product : shop.getProductList()) {
            System.out.printf("Имя товара: %s, Цена товара: %d\n",product.getName(),product.getPrice());
        }
        shop.edit(cake);
        for (Product product : shop.getProductList()) {
            System.out.println(product.getName());
        }
    }
}
