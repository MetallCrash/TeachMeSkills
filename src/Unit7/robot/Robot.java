package Unit7.robot;

import Unit7.robot.hands.IHand;
import Unit7.robot.heads.IHead;
import Unit7.robot.legs.ILeg;

public class Robot implements IRobot {
    private String name;
    private IHead head;
    private IHand hand;
    private ILeg leg;

    public Robot(String name,IHead head, IHand hand, ILeg leg) {
        this.name=name;
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public Robot(){}

    public IHead getHead() {
        return head;
    }

    public void setHead(IHead head) {
        this.head = head;
    }

    public IHand getHand() {
        return hand;
    }

    public void setHand(IHand hand) {
        this.hand = hand;
    }

    public ILeg getLeg() {
        return leg;
    }

    public void setLeg(ILeg leg) {
        this.leg = leg;
    }

    public String getName() {
        return name;
    }

    @Override
    public void action() {
        head.speak();
        hand.upHand();
        leg.step();
    }

    /**
     * Get the cost of a robot
     * @return int
     */
    @Override
    public int getPrice() {
        int price = head.getPrice() + hand.getPrice() + leg.getPrice();
        return price;
    }



}
