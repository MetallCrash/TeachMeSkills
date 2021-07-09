public class Uni1Task7 {
    public static void main(String[] args) {
        int a = 1001;
        int b = 0;
        b = a % 100;
        if (b >= 10 && b <= 19) {
            System.out.println(a + " Программистов");
        } else {
            b = a % 10;
            if (b == 0 || (b >= 5 && b <= 9)) {
                System.out.println(a + " Программистов");
            } else if (b == 1) {
                System.out.println(a + " Программист");
            } else if (b >= 2 && b <= 4) {
                System.out.println(a + " Программиста");
            }
        }
    }
}

