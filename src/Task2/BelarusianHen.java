package Task2;

public class BelarusianHen extends Hen {
    final static int EGGS_PER_MONTH = 30;
    final static String COUNTRY = "Беларусь";
    static boolean isShownDescryption = false;

    public BelarusianHen() {
        super.hens.add(this);
        if (!isShownDescryption) {
            System.out.println(this.getDescription());
            isShownDescryption = true;
        }
    }

    @Override
    int getCountOfEggsPerMonth() {
        return this.EGGS_PER_MONTH;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + this.COUNTRY + ". Я несу " + EGGS_PER_MONTH + " яиц в месяц.";
    }
}
