package Unit3;

import java.util.Random;
import java.util.Scanner;

public class Uni3Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите длинну массива");
        int sc = scanner.nextInt();
        int[] arr = new int[sc];
        for (int i = 0; i < arr.length; i++) {
            int r = random.nextInt(sc);
            arr[i] = r;
            System.out.print(arr[i] + " ");
        }
        int min = sc;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                if (min > arr[i]) {
                    min = arr[i];
                }
            }
        }
        System.out.println();
        System.out.println("Минимальный нечетный элемент массива: " + min);
    }
}

