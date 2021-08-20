package Unit11.Task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Uni11Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader brText=new BufferedReader(new FileReader("HomeWork/src/Unit11/Task3/Text.txt"));
        BufferedReader brBlackList=new BufferedReader(new FileReader("HomeWork/src/Unit11/Task3/BlackList.txt"));
        String textLine;
        String blackListLine=brBlackList.readLine();
        int banSentence=0;
        boolean hasBanWords=false;
        while((textLine=brText.readLine())!=null){
            String [] textWords=textLine.split("[,|.|\\!|:|;|\\?|\\s]");
            for (int i=0;i< textWords.length;i++){
                if (textWords[i].equals(blackListLine)){
                    banSentence++;
                    hasBanWords=true;
                    System.out.println("Предложение подлежащее исправлению.");
                    System.out.println(textLine+"\n");
                    break;
                }
            }
        }
        if (hasBanWords){
            System.out.println("Количество недопустимых предложений : "+banSentence);
        }else{
            System.out.println("Текст прошёл проверку на цензуру");
        }
    }
}
