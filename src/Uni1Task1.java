public class Uni1Task1 {
    public static void main(String[] args) {
        int a = 69;
        if (a > 0) {
            if (a < 10) {
                System.out.println(a + " является однозначным положительным числом");
            } else if (a >= 10 && a < 100) {
                System.out.println(a + " является двухзначным положительным числом");
            } else {
                System.out.println(a + " является трехзначным и более положительным числом");
            }
        } else if (a < 0) {
            if (a > -10) {
                System.out.println(a + " является однозначным отрицательным числом");
            } else if (a <= -10 && a > -100) {
                System.out.println(a + " является двухзначным отрицательным числом");
            } else {
                System.out.println(a + "  является трехзначным и более отрицательным числом");
            }
        } else {
            System.out.println(a + " не является ни положительным, ни отрицательным числом, однозначное числом");
        }
    }
}