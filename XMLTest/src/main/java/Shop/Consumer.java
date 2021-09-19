package Shop;

import java.io.IOException;

public class Consumer implements Runnable {
    Shop shop;

    public Consumer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        System.out.println("Я кансумер и я кансумирую");
        for (int i = 0; i < 10; i++) {
            try {
                shop.buyProduct();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
