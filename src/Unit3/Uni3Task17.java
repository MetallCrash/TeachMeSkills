package Unit3;

import java.util.Random;
import java.util.Scanner;

public class Uni3Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите длинну массива");
        int sc = scanner.nextInt();
        int[] arr = new int[sc];
        System.out.println("Введите число которое хотите найти в массиве");
        sc = scanner.nextInt();
        System.out.println("Массив");
        for (int i=0;i<arr.length;i++){
            int r= random.nextInt(sc+1);
            arr[i]=r;
            System.out.print(arr[i]+" ");
        }
        int n=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==sc){
                n+=1;
            }
        }
        System.out.println();
        if (n>0){
            System.out.println("Заданное число встречается "+n+" раза");
        }else{
            System.out.println("Заданного числа в массиве нет");
        }
    }
}
