package Unit10;

public class Test {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", 250, 15000);
        Car audi = new Car("AUDI", 230, 13000);
        Car mercedes = new Car("mercedes", 260, 16000);
        Car[] cars = new Car[]{bmw, audi, mercedes};
        for (int i=0;i< cars.length;i++) {
            try {
                cars[i].start();
            } catch (EngineStartFailureExceprion e) {
            }
        }
    }
}
