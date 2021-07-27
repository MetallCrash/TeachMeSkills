package Unit6;

import java.util.Scanner;

public class FlyingPassengerTransport extends FlyingTransport{
    private final int numberOfPassengers;
    private final boolean businessClass;

    public FlyingPassengerTransport(String model, int horsePower, int maxSpeed, int weight, int wingSpan, int runwayLength,int numberOfPassengers,boolean businessClass){
        super(model, horsePower, maxSpeed, weight, wingSpan, runwayLength);
        this.numberOfPassengers=numberOfPassengers;
        this.businessClass=businessClass;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Максимальная загрузка пассажиров: "+getNumberOfPassengers());
        System.out.println("Наличие бизнес класса: "+isBusinessClass());
    }

    @Override
    public void power() {
        double power = getHorsePower() * 0.74;
        System.out.println("Мощность в кВ: " + power);
    }

    public void passengerCapacity(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество пассажиров");
        double passengerCount = scanner.nextDouble();
        while (passengerCount < 0) {
            System.out.println("Введите корректное количество пассажиров");
            passengerCount = scanner.nextDouble();
        }
        if (passengerCount <= getNumberOfPassengers()) {
            System.out.println("Самолет загружен и готов к полету");
        } else {
            System.out.println("Нужен самолет побольше");
        }
    }


}
