package Unit7.robot;


import Unit7.robot.hands.IHand;
import Unit7.robot.hands.SamsungHand;
import Unit7.robot.hands.SonyHand;
import Unit7.robot.hands.ToshibaHand;
import Unit7.robot.heads.IHead;
import Unit7.robot.heads.SamsungHead;
import Unit7.robot.heads.SonyHead;
import Unit7.robot.heads.ToshibaHead;
import Unit7.robot.legs.ILeg;
import Unit7.robot.legs.SamsungLeg;
import Unit7.robot.legs.SonyLeg;
import Unit7.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        IHead sonyHead = new SonyHead(2);
        IHead toshibaHead = new ToshibaHead(2);
        IHead samsungHead = new SamsungHead(2);

        IHand sonyHand = new SonyHand(2);
        IHand toshibaHand = new ToshibaHand(2);
        IHand samsungHand = new SamsungHand(2);

        ILeg sonyLeg = new SonyLeg(2);
        ILeg toshibaLeg = new ToshibaLeg(2);
        ILeg samsungLeg = new SamsungLeg(1);

        Robot robot1 = new Robot("Оптимус прайм", sonyHead, toshibaHand, samsungLeg);
        Robot robot2 = new Robot("Мегазорд", toshibaHead, samsungHand, sonyLeg);
        Robot robot3 = new Robot("АТ-АТ", samsungHead, sonyHand, toshibaLeg);

        robot1.action();
        System.out.println();
        robot2.action();
        System.out.println();
        robot3.action();
        System.out.println();
//        if (robot1.getPrice() > robot2.getPrice() && robot1.getPrice() > robot3.getPrice()) {
//            System.out.println("Самый дорогой робот " + robot1.getName() + " с ценой в: " + robot1.getPrice());
//        } else if (robot2.getPrice() > robot1.getPrice() && robot2.getPrice() > robot3.getPrice()) {
//            System.out.println("Самый дорогой робот " + robot2.getName() + " с ценой в: " + robot2.getPrice());
//        } else {
//            System.out.println("Самый дорогой робот " + robot3.getName() + " с ценой в: " + robot3.getPrice());
//        }
        Robot[] robots = new Robot[]{robot1, robot2, robot3};
        Robot expensiveRobot = robots[0];
        for (int i = 0; i < robots.length; i++) {
            for (int j = 0; j < robots.length; j++) {
                if (robots[i].getPrice() > robots[j].getPrice()) {
                    expensiveRobot = robots[i];
                }
            }
        }
        for (int i = 0; i < robots.length; i++) {
            if (expensiveRobot.getPrice() == robots[i].getPrice()) {
                System.out.println("Самый дорогой робот " + robots[i].getName() + " c ценой в: " + robots[i].getPrice());
            }
        }
    }
}
