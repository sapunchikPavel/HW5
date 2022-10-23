package Task2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 100; i++){
            switch (random.nextInt(4)) {
                case 0 -> new RussianHen();
                case 1 -> new UkranianHen();
                case 2 -> new MoldovanHen();
                case 3 -> new BelarusianHen();
            }
        }


        System.out.println("За год куры снесли " + Hen.getTotalEggsAmount(12) + " яиц");
    }
}
