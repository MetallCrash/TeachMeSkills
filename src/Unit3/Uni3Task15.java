package Unit3;

import java.util.Random;
import java.util.Scanner;

public class Uni3Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите длинну массива");
        int sc = scanner.nextInt();
        int[] arr = new int[sc];
        System.out.println("Массив до изменений");
        for (int i = 0; i < arr.length; i++) {
            int r = random.nextInt(sc+1);
            arr[i] = r;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Массив после изменений");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }
}
