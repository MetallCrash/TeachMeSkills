package Unit3;

import java.util.Random;
import java.util.Scanner;

public class Uni3Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите длинну массива");
        int sc = scanner.nextInt();
        int[] arr = new int[sc];
        System.out.println("Массив");
        for (int i = 0; i < arr.length; i++) {
            int r = random.nextInt(sc + 1);
            arr[i] = r;
            System.out.print(arr[i] + " ");
        }
        int max = 0;
        int z = arr.length;
        int indexMax = 0;
        int indexZero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                indexMax = i;
            }
            if (arr[i] < z) {
                z = arr[i];
                indexZero = i;
            }
        }
        System.out.println();
        System.out.println("Максимальный элемент в массиве " + max + " под индексом " + indexMax);
        System.out.println("Минимальный элемент в массиве " + z + " под индексом " + indexZero);
        int w;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == z) {
                w = max;
                max = arr[i];
                arr[i] = w;
                arr[indexMax] = max;
            } else if (arr[i] == max) {
                w = z;
                z = arr[i];
                arr[i] = w;
                arr[indexZero] = z;
            }
            System.out.print(arr[i] + " ");
        }
    }
}
