package Unit6;

import java.util.Scanner;

public class CargoTransport extends LandingTransport {
    private final int liftingPower;

    public CargoTransport(TransportModel transportModel, int horsePower, int maxSpeed, int weight, int numberOfWheels, int fuelConsumption, int liftingPower) {
        super(transportModel, horsePower, maxSpeed, weight, numberOfWheels, fuelConsumption);
        this.liftingPower = liftingPower;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Грузоподъемность: " + liftingPower);
        System.out.println("Мощность в киловатах: " + power());
    }

    public void load() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вес груза");
        double load = scanner.nextDouble();
        while (load < 0) {
            System.out.println("Введите корректный вес груза");
            load = scanner.nextDouble();
        }
        if (load <= liftingPower) {
            System.out.println("Грузовик загружен и готов к отправке");
        } else {
            System.out.println("Нужен грузовик побольше");
        }

    }
}
