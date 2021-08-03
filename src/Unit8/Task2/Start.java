package Unit8.Task2;

public interface Start {
    boolean checkingSystem();
    default void engineStart(){
        int [] count=new int[10];
        int number=10;
        for (int i = 0; i<count.length;i++){
            count[i]=number;
            System.out.println(count[i]+"...");
            number--;
        }
    }
    void start();
}
