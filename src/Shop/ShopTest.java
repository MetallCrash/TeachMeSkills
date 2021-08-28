package Shop;

public class ShopTest {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Product cheese = new Product(0, "Cheese", 3);
        Product bread = new Product(10, "Bread", 1);
        Product meat = new Product(20, "Meat", 10);
        Product vine = new Product(30, "Vine", 15);
        Product cake = new Product(40, "Cake", 8);

        shop.addProduct(cheese);
        shop.addProduct(bread);
        shop.addProduct(meat);
        shop.addProduct(vine);
        shop.addProduct(cake);

        shop.start();
    }
}
