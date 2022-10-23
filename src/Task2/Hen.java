package Task2;

import java.util.ArrayList;

public abstract class Hen {
    static ArrayList<Hen> hens = new ArrayList<Hen>();

    static int totalEggsAmount;

    abstract int getCountOfEggsPerMonth();

    public static int getTotalEggsAmount(int countOfMonth) {
        for (Hen hen : hens) {
            totalEggsAmount += hen.getCountOfEggsPerMonth()*countOfMonth;
        }
        return totalEggsAmount;
    }

    String getDescription() {
        return "Я курица.";
    }
}
