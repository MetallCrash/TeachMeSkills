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

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public TransportModel getModel() {
        return transportModel;
    }

    public void info() {
        System.out.println("Мощность в лошадиных силах: " + horsePower);
        System.out.println("Максимальная скорость: " + maxSpeed);
        System.out.println("Вес: " + weight);
        System.out.println("Модель: " + transportModel);
    }

    public double power() {
        return horsePower * 0.74;
    }
}
