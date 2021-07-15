package Unit3;

public class Uni3Task1 {
    public static void main(String[] args) {
        int[] mas = new int[10];
        int n = 0;
        for (int i = 0; i < 10; i++) {
            n += 2;
            mas[i] = n;
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        n = 2;
        for (int i = 0; i < 9; i++) {
            n += 2;
            mas[i] = n;
            System.out.println(mas[i]);
        }
    }
}
