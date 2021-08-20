package Unit11.Task2;

import java.io.*;

public class TextFormatter {
    public static int wordsCount(String string) {
        String[] words = string.split(" ");
        return words.length;
    }

    public static boolean hasPalindrome(String string) {
        boolean isPalindrome = false;
        String[] words = string.split(" ");
        StringBuilder stringBuilder;
        for (int i = 0; i < words.length; i++) {
            stringBuilder = new StringBuilder(words[i]);
            if (stringBuilder.reverse().toString().equals(words[i])) {
                isPalindrome = true;
                break;
            }
        }
        return isPalindrome;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("HomeWork/src/Unit11/Task2/Text.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("HomeWork/src/Unit11/Task2/SentenceAndPalindromes.txt"));
        String str1 = bufferedReader.readLine();
        String[] sentence = str1.split("\\.");
        for (int i = 0; i < sentence.length; i++) {
            if (wordsCount(sentence[i]) >= 3 && wordsCount(sentence[i]) <= 5 || hasPalindrome(sentence[i])) {
                bufferedWriter.write(sentence[i] + "\n");
            }
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
