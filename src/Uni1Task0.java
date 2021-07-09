import java.sql.SQLOutput;

public class Uni1Task0 {
    public static void main(String[] args) {
        int day = 17;
        int month = 12;
        System.out.println("Арифметические операторы");
        int a = day + month;
        System.out.println("day+month=" + a);
        int b = day - month;
        System.out.println("day-month=" + b);
        int c = day * month;
        System.out.println("day*month=" + c);
        double d = (double) day / month;
        System.out.println("day/month=" + d);
        int e = day % month;
        System.out.println("day%month=" + e);
        System.out.println("");
        System.out.println("Операторы с присваиванием");
        int aa = day += month;
        if (a == aa) {              //использовал if и else что бы получить точные вычесления а не просто вывод на экран
            System.out.println("day+=month=" + aa);
        } else {
            day = 17;
            System.out.println("day+=month=" + (day += month));
        }
        int bb = day -= month;
        if (b == bb) {
            System.out.println("day-=month" + bb);
        } else {
            day = 17;
            System.out.println("day-=month=" + (day -= month));
        }
        int cc = day *= month;
        if (c == cc) {
            System.out.println("day*=month" + cc);
        } else {
            day = 17;
            System.out.println("day*=month=" + (day *= month));
        }
        double doubleDay = day; //Заменили int'овую переменную day на переменную double, чтобы получать дробное число а не целое число
        double dd = doubleDay /= month;
        if (d == dd) {
            System.out.println("day/=month=" + dd);
        } else {
            day = 17;
            System.out.println("day/=month=" + (doubleDay /= month));
        }
        System.out.println("");
        System.out.println("Битовые операторы");
        int aaa = day | month;
        System.out.println("day|month=" + aaa);
        int bbb = day & month;
        System.out.println("day&month=" + bbb);
        int ccc = day ^ month;
        System.out.println("day^month=" + ccc);
        System.out.println("");
        System.out.println("Операторы сравнения");
        if (day == month) {
            System.out.println("day равен month");
        } else {
            System.out.println("day не равен month");
        }
        if (day != month) {
            System.out.println("day не равен month");
        } else {
            System.out.println("day равен month");
        }
        if (day >= month) {
            System.out.println("day больше month");
        } else {
            System.out.println("day меньше month");
        }
        if (day <= month) {
            System.out.println("day меньше month");
        } else {
            System.out.println("day больше month");
        }
        System.out.println("");
        System.out.println("Логические операторы");
        if (day==17&&month==12){
            System.out.println("Верно");
        }else{
            System.out.println("Неверно");
        }
        if (day==17||month==12){
            System.out.println("Верно");
        }else{
            System.out.println("Неверно");
        }
        if (day!=month){
            System.out.println("Верно");
        }else{
            System.out.println("Неверно");
        }
    }
}
