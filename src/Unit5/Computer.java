package Unit5;

import java.util.Random;
import java.util.Scanner;

public class Computer {

    String cpu;
    String ram;
    String hdd;
    int resource;

    public Computer(String cpu, String ram, String hdd, int resource) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.resource = resource;
    }

    void displayInfo() {
        if (resource > 0) {
            System.out.println(cpu + " " + ram + " " + hdd + " " + "Ресурс компьютера: " + resource);
        }else{
            System.out.println("Сгорел сгорел");
        }
    }

    int turnOn() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 0 или 1 для включения комьютера");
        int on = scanner.nextInt();
        while (on >= 2 || on < 0) {
            System.out.println("Введите 0 или 1");
            on = scanner.nextInt();
        }
        int r = random.nextInt(2);
        if (resource > 0) {
            if (r == on) {
                System.out.println("Все системы запущены и готовы к работе");
                return resource - 1;
            } else {
                System.out.println("Произошел сбой в питании, завершение работы");
                return resource = 0;
            }
        } else {
            System.out.println("Компютер сгорел");
            return resource;
        }
    }


    int turnOff() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 0 или 1 для выключения комьютера");
        int off = scanner.nextInt();
        while (off >= 2 || off < 0) {
            System.out.println("Введите 0 или 1");
            off = scanner.nextInt();
        }
        int r = random.nextInt(2);
        if (resource > 0) {
            if (r == off) {
                System.out.println("Завершение работы");
                return resource - 1;
            } else {
                System.out.println("Произошел сбой в питании, экстренное выключение");
                return resource = 0;
            }
        } else {
            System.out.println("Компютер сгорел");
            return resource;
        }
    }
}
