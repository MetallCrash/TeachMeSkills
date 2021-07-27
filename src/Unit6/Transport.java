package Unit6;

public abstract class Transport {
    private final int horsePower;
    private final int maxSpeed;
    private final int weight;
    private final TransportModel transportModel;

    public Transport(TransportModel transportModel, int horsePower, int maxSpeed, int weight) {
        this.transportModel = transportModel;
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public TransportModel getModel() {
        return transportModel;
    }

    public abstract void info();

    public double power() {
        return horsePower * 0.74;
    }
}
