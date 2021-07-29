package Unit6;

import java.util.Scanner;

public class FlyingPassengerTransport extends FlyingTransport {
    private final int numberOfPassengers;
    private final boolean hasBusinessClass;

    public FlyingPassengerTransport(TransportModel transportModel, int horsePower, int maxSpeed, int weight, int wingSpan, int runwayLength, int numberOfPassengers, boolean hasBusinessClass) {
        super(transportModel, horsePower, maxSpeed, weight, wingSpan, runwayLength);
        this.numberOfPassengers = numberOfPassengers;
        this.hasBusinessClass = hasBusinessClass;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Максимальная загрузка пассажиров: " + numberOfPassengers);
        System.out.println("Наличие бизнес класса: " + hasBusinessClass);
        System.out.println("Мощность в киловатах: " + power());
    }

    public void passengerCapacity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество пассажиров");
        int passengerCount = scanner.nextInt();
        while (passengerCount < 0) {
            System.out.println("Введите корректное количество пассажиров");
            passengerCount = scanner.nextInt();
        }
        if (passengerCount <= numberOfPassengers) {
            System.out.println("Самолет загружен и готов к полету");
        } else {
            System.out.println("Нужен самолет побольше");
        }
    }


}
