public class Uni1Task5 {
    public static void main(String[] args) {
        int a = 0;
        int b = 63;
        int c = -4;
        int pos = 0;
        int neg = 0;
        int zero = 0;
        if (a > 0) {
            pos++;
        } else if (a < 0) {
            neg++;
        } else {
            zero++;
        }
        if (b > 0) {
            pos++;
        } else if (b < 0) {
            neg++;
        } else {
            zero++;
        }
        if (c > 0) {
            pos++;
        } else if (c < 0) {
            neg++;
        } else {
            zero++;
        }
        System.out.println("Количество положительных чисел: " + pos);
        System.out.println("Количество отрицательых чисел: " + neg);
        System.out.println("Количество чисел равных нулю: " + zero);


    }
}
