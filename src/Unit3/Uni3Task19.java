package Unit3;

import java.util.Random;
import java.util.Scanner;

public class Uni3Task19 {
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
        int nMin = arr.length;
        for (int i = 1; i < arr.length; i += 2) {
            if (arr[i] <= nMin) {
                nMin = arr[i];
            }
        }
        System.out.println();
        System.out.println("Минимальное значение четных индексов массива: " + nMin);
    }
}
