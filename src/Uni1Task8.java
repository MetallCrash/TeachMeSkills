import java.util.Scanner;
public class Uni1Task8 {
    public static void main (String[]args){
        System.out.println("Введите два числа что бы узнать какое из них больше");
        Scanner s=new Scanner(System.in);
        System.out.println("Введите первое число");
        int a=s.nextInt();
        System.out.println("Введите второе число");
        int b=s.nextInt();
        if (a>b){
            System.out.println(a+" Большее число чем "+b);
        }else{
            System.out.println(b+" Большее число чем "+a);
        }
    }
}
