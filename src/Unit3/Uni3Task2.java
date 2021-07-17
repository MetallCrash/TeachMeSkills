package Unit3;

public class Uni3Task2 {
    public static void main(String[] args) {
        int[] mas = new int[50];
        int n = 1;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = n;
            n += 2;
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for (int i = mas.length-1; i >= 0; i--) {
            System.out.print(mas[i] + " ");
        }
    }
}
