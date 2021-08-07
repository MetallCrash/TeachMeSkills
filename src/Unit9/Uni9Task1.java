package Unit9;

public class Uni9Task1 {
    public static void main(String[] args) {
        String str = "Автовокзал";
        StringBuilder stringBuilder = new StringBuilder(str);
        int start = stringBuilder.indexOf("А");
        int end = stringBuilder.lastIndexOf("в");
        System.out.println(stringBuilder.substring(start, end));
    }
}
