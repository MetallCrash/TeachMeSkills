package Unit11.Task1;

import java.io.*;

public class Uni11Task1 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb;
        BufferedReader br = new BufferedReader(new FileReader("HomeWork/src/Unit11/Task1/Text.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("HomeWork/src/Unit11/Task1/palindromes.txt"));
        String string;
        while ((string = br.readLine()) != null) {
            sb = new StringBuilder(string);
            if (sb.reverse().toString().equals(string)) {
                bw.write(string + "\n");
            }
        }
        br.close();
        bw.close();
    }
}

