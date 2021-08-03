package Unit8.Task2;

import java.util.Random;

public class Shuttle implements Start{
    @Override
    public boolean checkingSystem() {
        boolean isCheckingSystem;
        Random random=new Random();
        int r= random.nextInt(11);
        isCheckingSystem= r > 3;
        return isCheckingSystem;
    }

    @Override
    public void engineStart() {
        System.out.println("Обратный отсчет до запуска Шатла.");
        Start.super.engineStart();
        System.out.println("Двигатели Шатла запущены.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла.");
    }
}
