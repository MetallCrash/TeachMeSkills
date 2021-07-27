package Unit6;

public abstract class FlyingTransport extends Transport {
    private final int wingSpan;
    private final int runwayLength;

    public FlyingTransport(String model, int horsePower, int maxSpeed, int weight, int wingSpan, int runwayLength) {
        super(model, horsePower, maxSpeed, weight);
        this.wingSpan = wingSpan;
        this.runwayLength = runwayLength;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public int getRunwayLength() {
        return runwayLength;
    }

    @Override
    public void info() {
        System.out.println("Мощность в лошадиных силах: " + getHorsePower());
        System.out.println("Максимальная скорость: " + getMaxSpeed());
        System.out.println("Вес: " + getWeight());
        System.out.println("Модель: " + getModel());
        System.out.println("Размах крыльев: " + getWingSpan());
        System.out.println("Минимальная длина взлетно-посадочной полосы для взлета: " + getRunwayLength());
    }

    @Override
    public abstract void power();
}
