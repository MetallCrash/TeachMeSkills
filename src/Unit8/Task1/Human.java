package Unit8.Task1;

import Unit8.Task1.Jacket.Jacket;
import Unit8.Task1.Pants.Pants;
import Unit8.Task1.Shoes.Shoes;

public class Human {
    private String name;
    private Jacket jacket;
    private Pants pants;
    private Shoes shoes;

    public Human(String name, Jacket jacket, Pants pants, Shoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public void putOn() {
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    public void takeOff() {
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
    }
}
