package Unit3;

import java.util.Random;

public class Uni3Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mas = new int[4];
        int n = 0;
        int j = 0;
        for (int i = 0; i < mas.length; i++) {
            int r = random.nextInt(10);
            mas[i] = r;
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i] <= mas[i + 1]) {
                n += 1;
            } else {
                j += 2;
            }
        }
        if (n > j) {
            System.out.println("Массив с возрастающей последовательностью");
        } else {
            System.out.println("Массив не с возрастающей последовательностью");
        }
    }
}

