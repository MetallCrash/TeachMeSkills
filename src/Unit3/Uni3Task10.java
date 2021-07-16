package Unit3;

import java.util.Random;
import java.util.Scanner;

public class Uni3Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите число");
        int n = sc.nextInt();
        int n2 = 0;
        for (; n <= 3; n = sc.nextInt()) {
            System.out.println("Вы ввели не подходящее число, попробуйте другое значение");
        }
        int[] arr1 = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            int r = random.nextInt(n);
            arr1[i] = r;
            System.out.print(arr1[i] + " ");
            if (arr1[i] % 2 == 0 && arr1[i] != 0) {
                n2 += 1;
            }
        }
        System.out.println();
        int[] arr2 = new int[n2];
        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0 && arr1[i] != 0) {
                arr2[j] = arr1[i];
                if (j < arr2.length - 1) {
                    System.out.print(arr2[j] + " ");
                    j += 1;
                } else if (j == arr2.length - 1) {
                    System.out.print(arr2[j]);
                }
            }
        }
        if (n2 == 0) {
            System.out.println("Второй массив отсутствует за счет отсуствия четных чисел у первого");
        }
    }
}
