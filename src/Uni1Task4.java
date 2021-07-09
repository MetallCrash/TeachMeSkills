public class Uni1Task4 {
    public static void main(String[]args){
        int a=5;
        int b=0;
        int c=-9;
        int pos=0;
        if (a>0) {
            pos++;
        }
        if (b > 0) {
           pos++;
        }
        if (c>0){
            pos++;
        }
        System.out.println("Количество положительных чисел: "+pos);
    }
}
