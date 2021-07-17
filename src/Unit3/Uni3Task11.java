package Unit3;

import java.util.Random;

public class Uni3Task11 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        int n = 1;
        System.out.println("Массив");
        for (int i = 0; i < arr.length; i++) {
            int r = random.nextInt(10);
            arr[i] = r;
            System.out.print(arr[i] + " ");
            if (arr[i] % 2 != 0 && arr[i] != 0) {
                n *= arr[i];
            }
        }
        System.out.println();
        System.out.println("Прозведение всех нечетных чисел массива: " + n);
    }
}
