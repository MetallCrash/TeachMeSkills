package Unit11.Task4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Uni11Task4 {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("HomeWork/src/Unit11/Task4/car.dat"))){
            Car lamborghini=new Car("Lamborghini",300,300000);
            oos.writeObject(lamborghini);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("HomeWork/src/Unit11/Task4/car.dat"))){
            Car lamborghini=(Car)ois.readObject();
            System.out.printf("Model: %s\nSpeed: %d km/h\nPrice: %d$",lamborghini.getModel(),lamborghini.getSpeed(),lamborghini.getPrice());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
