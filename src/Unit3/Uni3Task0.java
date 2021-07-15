package Unit3;

import java.util.Random;
import java.util.Scanner;

public class Uni3Task0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите длинну массива");
        int a = sc.nextInt();
        int[] mas = new int[a];
        for (int i = 0; i < a; i++) {
            int r = random.nextInt(10);
            mas[i] = r;
            System.out.print(mas[i] + " ");
        }
    }
}
