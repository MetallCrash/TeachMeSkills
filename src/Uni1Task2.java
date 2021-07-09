public class Uni1Task2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = 10;
        if (a + b > c & a + c > b & b + c > a) {
            System.out.println("Такой треугольник существует");
        } else {
            System.out.println("Такого треугольника не существует");
        }
    }
}
