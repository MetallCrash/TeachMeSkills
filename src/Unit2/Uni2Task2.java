package Unit2;

public class Uni2Task2 {
    public static void main(String[] args) {
        int time = 3;
        int amoeba = 2;
        while (time < 25) {
            System.out.println("Количество амеб через " + time + " часов: " + amoeba);
            amoeba *= 2;
            time += 3;
        }

    }
}
