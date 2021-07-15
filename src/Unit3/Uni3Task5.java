package Unit3;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Random;

public class Uni3Task5 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] m1 = new int[5];
        int[] m2 = new int[5];
        int s1 = 0;
        int s2 = 0;
        for (int i = 0; i < 5; i++) {
            int r = random.nextInt(15);
            m1[i] = r;
            s1 += m1[i];
            System.out.print(m1[i] + " ");
        }
        int sA1 = s1 / 5;
        System.out.println();
        System.out.println("Среднее арифметическое первого массива: " + sA1);
        System.out.println();
        for (int i = 0; i < 5; i++) {
            int r = random.nextInt(15);
            m2[i] = r;
            s2 += m2[i];
            System.out.print(m2[i] + " ");
        }
        int sA2 = s2 / 5;
        System.out.println();
        System.out.println("Среднее арифметическое второго массива: " + sA2);
        System.out.println();
        if (sA1 > sA2) {
            System.out.println("Среднее арифметическое у первого массива больше: " + sA1 + " > " + sA2);
        } else if (sA1 < sA2) {
            System.out.println("Среднее арифметическое у второго массива больше: " + sA2 + " > " + sA1);
        } else {
            System.out.println("Средние арифметические значения у обоих массивов равны: " + sA1 + " = " + sA2);
        }
    }
}
