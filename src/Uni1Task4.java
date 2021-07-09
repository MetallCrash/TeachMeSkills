public class Uni1Task4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int c = -9;
        int positiveCount = 0;
        if (a > 0) {
            positiveCount++;
        }
        if (b > 0) {
            positiveCount++;
        }
        if (c > 0) {
            positiveCount++;
        }
        System.out.println("Количество положительных чисел: " + positiveCount);
    }
}
