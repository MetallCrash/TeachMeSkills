package Unit4;

import java.util.Random;
import java.util.Scanner;

public class Uni4Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер матрицы");
        int sc = scanner.nextInt();
        int[][] arr = new int[sc][sc];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int r = random.nextInt(50);
                arr[i][j] = r;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][i] % 2 == 0) {
                sum += arr[i][i];
            }
        }
        System.out.println("Сумма четных элементов на главное диагонали: " + sum);
    }
}
