package Unit2;

public class Uni2Task1 {
    public static void main(String[] args) {
        double distance = 10;
        double distanceNext;
        double sumDistance=0;
        for (int day=1;day<7;day++){
            sumDistance+=distance;
            distanceNext=distance/10;
            distance+=distanceNext;
        }
        System.out.println(sumDistance);
    }
}