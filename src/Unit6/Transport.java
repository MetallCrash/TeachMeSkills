package Unit6;

public abstract class Transport {
    private final int horsePower;
    private final int maxSpeed;
    private final int weight;
    private final String model;

    public Transport(String model, int horsePower, int maxSpeed, int weight) {
        this.model = model;
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

    public String getModel() {
        return model;
    }

    public abstract void info();

    public abstract void power();
}
