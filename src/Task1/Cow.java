package Task1;

import java.security.spec.ECField;

public class Cow extends Animal implements IEat {

    public Cow() {
        this.setColor("Белая в черных пятнах");
        this.setSpeed(40);
        this.setWeight(1000);
        this.setDiet("Траву");
    }

    @Override
    public void Eat() {
        System.out.println("Корова ест " + this.getDiet());
    }
}
