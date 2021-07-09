public class Uni1Task1 {
    public static void main(String[] args) {
        int a = 69;
        if (a > 0 && a < 9) {
            System.out.println(a + " является однозначным положительным числом");
        } else if (a >= 10 && a < 99) {
            System.out.println(a + " является двухзначным положительным числом");
        } else if (a >= 100) {
            System.out.println(a + " является трехзнычным или более, положительным числом");
        } else if (a < 0 && a > -10) {
            System.out.println(a + " является одназначным отрицательным числом");
        } else if (a <= -10 && a > -100) {
            System.out.println(a + " является двухзначным отрицательным числом");
        } else if (a <= -100) {
            System.out.println(a + " является трехзначным или более, отрицательным числом");
        } else {
            System.out.println(a + " не является ни положительным, ни отрицательным числом, однозначное число");
        }
    }
}