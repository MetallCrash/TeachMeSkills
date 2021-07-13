package Unit2;

public class Uni2Task8 {
    public static void main(String[] args) {
        for (int a = 1; a < 5; a++) {
            for (int b = 4; b > a; b--) {
                System.out.print(" ");
            }
            for (int c = 0; c < a; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int x = 5; x > 1; x--) {
            for (int y = 5; y > x; y--) {
                System.out.print(" ");
            }
            for (int z = 1; z < x; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
