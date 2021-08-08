package Unit9.Task3;

import java.io.*;
import java.util.Scanner;

public class Uni9Task3 {
    public static void main(String[] args) throws IOException {
        String separator = File.separator;
        File palindromes=new File("C:" + separator + "Users" + separator + "PukanBombit" + separator +
                "IdeaProjects" + separator + "HomeWork" + separator + "src" + separator + "Unit9" + separator +
                "Task3" + separator + "palindromes.txt");
        FileReader fileReader = new FileReader("C:" + separator + "Users" + separator + "PukanBombit" + separator +
                "IdeaProjects" + separator + "HomeWork" + separator + "src" + separator + "Unit9" + separator +
                "Task3" + separator + "TextForReading.txt");
        Scanner scanner = new Scanner(fileReader);
        PrintWriter printWriter = new PrintWriter(palindromes);
        while (scanner.hasNextLine()) {
            StringBuilder strBuilderReverse = new StringBuilder(scanner.nextLine());
            StringBuilder strBuilderOrigin = new StringBuilder(strBuilderReverse);
            strBuilderReverse.reverse();
            if (strBuilderReverse.toString().equals(strBuilderOrigin.toString())) {
                printWriter.println(strBuilderOrigin);
            }
        }
        printWriter.close();
        scanner.close();
    }
}
