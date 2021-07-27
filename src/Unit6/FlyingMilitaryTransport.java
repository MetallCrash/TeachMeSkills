package Unit6;

public class FlyingMilitaryTransport extends FlyingTransport {
    private int numberOfMissles;
    private final boolean ejectSystem;

    public FlyingMilitaryTransport(String model, int horsePower, int maxSpeed, int weight, int wingSpan, int runwayLength, int numberOfMissles, boolean ejectSystem) {
        super(model, horsePower, maxSpeed, weight, wingSpan, runwayLength);
        this.numberOfMissles = numberOfMissles;
        this.ejectSystem = ejectSystem;
    }

    public int getNumberOfMissles() {
        return numberOfMissles;
    }

    public boolean isEjectSystem() {
        return ejectSystem;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Количство носимых ракет: " + getNumberOfMissles());
        System.out.println("Наличие системы катапультирования: " + isEjectSystem());
    }

    public void launch() {
        if (getNumberOfMissles() > 0) {
            System.out.println("Ракета пошла");
            numberOfMissles--;
        } else {
            System.out.println("Снаряды закончились, вернитесь на базу для пополнения");
        }
    }

    public void eject() {
        if (isEjectSystem()) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}
