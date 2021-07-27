package Unit6;

public class FlyingMilitaryTransport extends FlyingTransport {
    private int numberOfMissiles;
    private final boolean hasEjectSystem;

    public FlyingMilitaryTransport(TransportModel transportModel, int horsePower, int maxSpeed, int weight, int wingSpan, int runwayLength, int numberOfMissiles, boolean hasEjectSystem) {
        super(transportModel, horsePower, maxSpeed, weight, wingSpan, runwayLength);
        this.numberOfMissiles = numberOfMissiles;
        this.hasEjectSystem = hasEjectSystem;
    }

    public int getNumberOfMissiles() {
        return numberOfMissiles;
    }

    public boolean hasEjectSystem() {
        return hasEjectSystem;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Количство носимых ракет: " + numberOfMissiles);
        System.out.println("Наличие системы катапультирования: " + hasEjectSystem);
        System.out.println("Мощность в киловатах: " + power());
    }

    public void launch() {
        if (numberOfMissiles > 0) {
            System.out.println("Ракета пошла");
            numberOfMissiles--;
        } else {
            System.out.println("Снаряды закончились, вернитесь на базу для пополнения");
        }
    }

    public void eject() {
        if (hasEjectSystem) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}
