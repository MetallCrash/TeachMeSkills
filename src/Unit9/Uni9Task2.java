package Unit9;

public class Uni9Task2 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Я люблю джаву.");
        char zero = stringBuilder.charAt(0);
        char three = stringBuilder.charAt(3);
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) == three) {
                stringBuilder.setCharAt(i, zero);
            }
        }
        System.out.println(stringBuilder);
    }
}
