package Unit3;

import java.util.Random;

public class Uni3Task7 {
    public static void main(String[]args){
        Random random=new Random();
        int [] mas= new int[12];
        for (int i=0; i< mas.length;i++){
            int r= random.nextInt(15);
            mas[i]=r;
            System.out.print(mas[i]+" ");
        }
        System.out.println();
        int max=0;
        int index=0;
        for (int i=0;i<mas.length;i++){
            if(mas[i]>max){
                max=mas[i];
            }
            }
        for (int i=0;i< mas.length;i++){
            if (max==mas[i]){
                index=i;
            }
        }
        System.out.println("Максимальное число "+max);
        System.out.println("Индекс максимального числа в массиве "+index);
    }
}
