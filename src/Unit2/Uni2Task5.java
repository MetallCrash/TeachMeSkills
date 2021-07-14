package Unit2;

public class Uni2Task5 {
    public static void main(String[] args) {
        double inch;
        double cm = 2.54;
        double sumCm = 0;
        for (inch = 1; inch <= 20; inch++) {
            sumCm += cm;
            System.out.print(inch + " дюймов" + " - " + sumCm + " см");
            System.out.println();
        }
    }
}
