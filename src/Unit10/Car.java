package Unit10;

import java.util.Random;

public class Car {
    private String model;
    private int speed;
    private int price;

    public Car() {
    }

    public Car(String model, int speed, int price) {
        this.model = model;
        this.speed = speed;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void start() throws EngineStartFailureExceprion {
        Random random=new Random();
        int r= random.nextInt(21);
        if (r%2==0){
            throw new EngineStartFailureExceprion("Ошибка запуска",model);
        }else{
            System.out.println("Двигатель "+model+" завелся.");
        }
    }
}
