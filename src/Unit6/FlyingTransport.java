package Unit6;

public abstract class FlyingTransport extends Transport {
    private final int wingSpan;
    private final int runwayLength;

    public FlyingTransport(TransportModel transportModel, int horsePower, int maxSpeed, int weight, int wingSpan, int runwayLength) {
        super(transportModel, horsePower, maxSpeed, weight);
        this.wingSpan = wingSpan;
        this.runwayLength = runwayLength;
    }


    @Override
    public void info() {
        super.info();
        System.out.println("Размах крыльев: " + wingSpan);
        System.out.println("Минимальная длина взлетно-посадочной полосы для взлета: " + runwayLength);
    }
}
