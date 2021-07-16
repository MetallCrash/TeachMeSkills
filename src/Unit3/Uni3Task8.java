package Unit3;

import java.util.Random;

public class Uni3Task8 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        double[] arr3 = new double[10];
        System.out.println("Первый массив");
        for (int i = 0; i < arr1.length; i++) {
            int r = random.nextInt(9);
            arr1[i] = r;
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("Второй массив");
        for (int i = 0; i < arr2.length; i++) {
            int r = random.nextInt(9);
            arr2[i] = r;
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        System.out.println("Третий массив");
        int sum = 0;
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = (double) arr1[i] / (double) arr2[i];
            if (arr1[i] == 0 && arr2[i] == 0) {
                arr3[i] = 0;
            } else if (arr2[i] == 0) {
                arr3[i] = 0;
            }
            System.out.print(arr3[i] + " ");
        }
        for (int i = 0; i < arr3.length; i++) {
            if ((arr3[i] + arr3[i]) % 2 == 0 || arr3[i] == 1) {
                sum += 1;
            }
        }
        System.out.println();
        System.out.print("Количество целых элементов в третьем массиве: " + sum);
    }
}
