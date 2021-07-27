package Unit6;

import java.util.Scanner;

public class LightTransport extends LandingTransport {
    private final String bodyType;
    private final int numberOfPassengers;

    public LightTransport(String model, int horsePower, int maxSpeed, int weight, int numberOfWheels, int fuelConsumption, String bodyType, int numberOfPassengers) {
        super(model, horsePower, maxSpeed, weight, numberOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numberOfPassengers = numberOfPassengers;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Тип кузова: " + getBodyType());
        System.out.println("Количество пассажиров: " + getNumberOfPassengers());
        power();
    }

    @Override
    public void power() {
        super.power();
        double power = getFuelConsumption() * 0.74;
        System.out.println("Мощность в кВ: " + power);
    }

    public void fuel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите время");
        double time = scanner.nextDouble();
        while (time < 0) {
            System.out.println("Введите корректное количество часов");
            time = scanner.nextDouble();
        }
        double distance = getMaxSpeed() * time;
        double fuel = (distance / 100) * getFuelConsumption();
        System.out.println("За " + time + "ч, " + getModel() + " двигаясь со скоростью " + getMaxSpeed() + "км/ч проедет " + distance + "км и израсходует " + fuel + "л топлива.");
    }
}
