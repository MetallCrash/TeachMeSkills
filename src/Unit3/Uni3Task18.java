package Unit3;

import java.util.Random;
import java.util.Scanner;

public class Uni3Task18 {
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
        int nMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (nMax < arr[i]) {
                nMax = arr[i];
            }
        }
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (n < arr[i] && arr[i] != nMax) {
                n = arr[i];
            }
        }
        System.out.println();
        System.out.println("Первый по величине элемент в массиве " + nMax);
        System.out.println("Второй по величине элемент в массиве " + n);
    }
}

