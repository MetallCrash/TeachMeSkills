package Unit2;

public class Uni2Task8 {
    public static void main(String[] args) {
        for (int a = 1; a < 5; a++) {
            for (int b = 1; b < (5 - a); b++) {
                System.out.print(" ");
            }
            for (int c = 1; c < (a + 1); c++) {
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
