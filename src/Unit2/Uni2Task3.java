package Unit2;

public class Uni2Task3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int a = 1; a <= 256; a *= 2) {
            sum += a;
        }
        System.out.println(sum);

    }
}
