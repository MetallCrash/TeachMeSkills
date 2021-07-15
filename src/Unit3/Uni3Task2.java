package Unit3;

public class Uni3Task2 {
    public static void main(String[] args) {
        int[] mas = new int[50];
        int min = 1;
        int max = 99;
        for (int i = 0; i < 50; i++) {
            mas[i] = min;
            min += 2;
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for (int i = 49; i >= 0; i--) {
            mas[i] = max;
            max -= 2;
            System.out.print(mas[i] + " ");
        }
    }
}
