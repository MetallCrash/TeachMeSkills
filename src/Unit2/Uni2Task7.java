package Unit2;

public class Uni2Task7 {
    public static void main(String[] args) {
        int a = 1;
        int num;
        int sum = 0;
        for (num = 1; num < 100; num += 2) {
            sum += num;
        }
        System.out.println("Сумма всех нечетных чисел равна " + sum);
    }
}
