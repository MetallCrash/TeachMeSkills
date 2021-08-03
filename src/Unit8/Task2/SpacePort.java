package Unit8.Task2;

public class SpacePort {
    public void launch(Start spaceship){
        spaceship.checkingSystem();
        System.out.println("Предстартовая проверка систем.");
        if (!spaceship.checkingSystem()){
            System.out.println("Проверка провалена.");
        }else{
            System.out.println("Проверка прошла успешно.");
            spaceship.engineStart();
            spaceship.start();
        }
    }
}
