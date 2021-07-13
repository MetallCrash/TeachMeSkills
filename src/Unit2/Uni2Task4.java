package Unit2;

public class Uni2Task4 {
    public static void main(String[] args) {
        int a = -20;
        int b = -10;
        int sum = 0;
        int i = 0;
        if (a >= 0 || b >= 0) {
            while (i < b) {
                sum += a;
                i++;
            }
            System.out.println(a + "*" + b + "=" + sum);
        } else if (a < 0 && b < 0) {
            while (i > b) {
                sum -= a;
                i--;
            }
            System.out.println(a + "*" + b + "=" + sum);
        }
    }
}
