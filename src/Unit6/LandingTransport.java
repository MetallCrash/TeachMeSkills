package Unit6;

public abstract class LandingTransport extends Transport {
    private final int numberOfWheels;
    private final int fuelConsumption;

    public LandingTransport(TransportModel transportModel, int horsePower, int maxSpeed, int weight, int numberOfWheels, int fuelConsumption) {
        super(transportModel, horsePower, maxSpeed, weight);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }


    @Override
    public void info() {
        super.info();
        System.out.println("Количество колес: " + numberOfWheels);
        System.out.println("Расход топлива: " + fuelConsumption);
    }
}
