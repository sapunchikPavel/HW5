package Task1;

public class Tiger extends Animal implements IEat {

    public Tiger() {
        this.setColor("Оранжевый в черную полоску");
        this.setDiet("Мясо");
        this.setWeight(250);
        this.setSpeed(60);
    }

    @Override
    public void Eat() {
        System.out.println("Тигр ест " + this.getDiet());
    }
}
