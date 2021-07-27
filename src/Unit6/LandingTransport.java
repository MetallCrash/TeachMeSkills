package Unit6;

public abstract class LandingTransport extends Transport {
    private final int numberOfWheels;
    private final int fuelConsumption;

    public LandingTransport(String model, int horsePower, int maxSpeed, int weight, int numberOfWheels, int fuelConsumption) {
        super(model, horsePower, maxSpeed, weight);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    @Override
    public void info() {
        System.out.println("Мощность в лошадиных силах: " + getHorsePower());
        System.out.println("Максимальная скорость: " + getMaxSpeed());
        System.out.println("Вес: " + getWeight());
        System.out.println("Модель: " + getModel());
        System.out.println("Количество колес: " + getNumberOfWheels());
        System.out.println("Расход топлива: " + getFuelConsumption());
    }

    @Override
    public void power() {
    }
}
