public class Uni1Task5 {
    public static void main(String[] args) {
        int a = 0;
        int b = 63;
        int c = -4;
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        if (a > 0) {
            positiveCount++;
        } else if (a < 0) {
            negativeCount++;
        } else {
            zeroCount++;
        }
        if (b > 0) {
            positiveCount++;
        } else if (b < 0) {
            negativeCount++;
        } else {
            zeroCount++;
        }
        if (c > 0) {
            positiveCount++;
        } else if (c < 0) {
            negativeCount++;
        } else {
            zeroCount++;
        }
        System.out.println("Количество положительных чисел: " + positiveCount);
        System.out.println("Количество отрицательых чисел: " + negativeCount);
        System.out.println("Количество чисел равных нулю: " + zeroCount);


    }
}
