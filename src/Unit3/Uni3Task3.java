package Unit3;

import java.util.Random;

public class Uni3Task3 {
    public static void main (String[]args){
        Random random=new Random();
        int [] mas=new int[15];
        int sum=0;
        for (int i=0;i<15;i++){
            int r=random.nextInt(99);
            mas[i]=r;
            System.out.print(mas[i]+" ");
            if (mas[i]%2==0){
                sum+=1;
            }
        }
        System.out.println();
        System.out.println("Количество четных чисел: "+sum);
    }
}
