package Unit4;

import java.util.Random;
import java.util.Scanner;

public class Uni4Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер матрицы");
        int sc = scanner.nextInt();
        int[][] arr = new int[sc][sc];
        int sum1 = 1;
        int sum2 = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int r = random.nextInt(50);
                arr[i][j] = r;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            sum1 *= arr[i][i];
        }
        for (int i = 0; i < arr.length; i++) {
            int j=arr.length-1-i;
            sum2 *= arr[i][j];
        }
        if (sum1>sum2){
            System.out.println("Произведение главной диагонали больше: "+sum1+" > "+sum2);
        }else if(sum1<sum2){
            System.out.println("Произведение побочной диагонали больше: "+sum1+" < "+sum2);
        }else{
            System.out.println("Произведения диагоналей равны: "+sum1+" = "+sum2);
        }
    }
}

