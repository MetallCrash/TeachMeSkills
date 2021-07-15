package Unit3;

import java.sql.SQLOutput;
import java.util.Random;

public class Uni3Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mas = new int[20];
        for (int i = 0; i < 20; i++) {
            int r = random.nextInt(100);
            mas[i] = r;
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 20; i++) {
            if (mas[i] % 2 != 0) {
                mas[i] = 0;
                System.out.print(mas[i] + " ");
            } else {
                System.out.print(mas[i] + " ");
            }
        }
    }
}


