package Unit8.Task2;

public interface Start {
    boolean checkingSystem();

    void start();

    default void engineStart() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i + "...");
        }
    }
}
