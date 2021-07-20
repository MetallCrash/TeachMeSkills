package Unit4;

import java.util.Random;
import java.util.Scanner;

public class Uni4Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер матрицы");
        int sc = scanner.nextInt();
        int[][] arr = new int[sc][sc];
        System.out.println("Матрица");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int r = random.nextInt(50);
                arr[i][j] = r;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Транспорированная матрица");
        int w;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                w = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = w;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
