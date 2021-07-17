package Unit3;

import java.util.Random;

public class Uni3Task12 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        int n = 0;
        double sum = 0;
        System.out.println("Массив");
        for (int i = 0; i < arr.length; i++) {
            int r = random.nextInt(10);
            arr[i] = r;
            System.out.print(arr[i] + " ");
            if (arr[i] % 2 != 0) {
                n += 1;
                sum += arr[i];
            }
        }
        System.out.println();
        System.out.println("Среднее арифметическое нечетных чисел в массиве: " + sum / n);
    }
}
