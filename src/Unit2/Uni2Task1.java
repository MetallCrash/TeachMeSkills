package Unit2;

public class Uni2Task1 {
    public static void main(String[] args) {
        double distance = 10; // расстояние первого дня
        double distanceNext; // задаем переменную разницы
        double sumDistance = 0; // общая дистанция
        for (int day = 1; day < 7; day++) {
            sumDistance += distance; // к общей дистанции добавляем дистанцию за текущий день
            distanceNext = distance / 10; // результат разницы последующего дня с текущим
            distance += distanceNext; // планируемая дистанция на следующий день
        }
        System.out.println("Дистанция за 7 дней: " + sumDistance + " км");
    }
}