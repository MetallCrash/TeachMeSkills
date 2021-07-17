package Unit3;

import java.util.Random;
import java.util.Scanner;

public class Uni3Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int[] arr = new int[10];
        System.out.println("Введите число");
        int C = sc.nextInt();
        int n = 0;
        double sum = 0;
        System.out.println("Массив");
        for (int i = 0; i < arr.length; i++) {
            int r = random.nextInt(20);
            arr[i] = r;
            System.out.print(arr[i] + " ");
            if (C < arr[i]) {
                n += 1;
                sum += arr[i];
            }
        }
        System.out.println();
        System.out.println("Среднее арифметическое элементов массива болших числа C: " + sum / n);
    }
}
