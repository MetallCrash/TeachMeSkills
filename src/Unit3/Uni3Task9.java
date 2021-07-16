package Unit3;

import java.util.Random;
import java.util.Scanner;

public class Uni3Task9 {
    public static void main(String[]args){
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите целое четное положительное число");
        int n=sc.nextInt();
        for (;n<=0||n%2!=0;n=sc.nextInt()){
            System.out.println("Вы ввели не подходящее число, попробуйте другое значение");
        }
        int [] arr=new int[n];
        for (int i=0;i<arr.length;i++){
            int r=random.nextInt(15);
            arr[i]=r;
            System.out.print(arr[i]+" ");
        }
        int index= arr.length/2;
        int sum1=0;
        int sum2=0;
        for (int i=0;i<index;i++){
            sum1+=arr[i];
        }
        for (int i=index;index< arr.length;index++){
            sum2+=arr[index];
        }
        System.out.println();
        System.out.println("Сумма первой половины массива: "+sum1);
        System.out.println("Сумма второй половины массива: "+sum2);
        if (sum1>sum2) {
            System.out.println(sum1 + " больше чем " + sum2);
        }else if (sum1<sum2){
            System.out.println(sum1 + " меньше чем " + sum2);
        }else{
            System.out.println(sum1 + " суммы равны " + sum2);
        }
    }
}
