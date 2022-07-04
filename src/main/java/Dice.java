import java.util.Random;

public class Dice {

    int value;
    int diceValue;

    public void setValue(int diceValue) {
        int value = diceValue;
    }

    public int getValue() {
        return diceValue;
    }

    public void rollDice() {
        Random r = new Random();
        value = r.nextInt(6) + 1;
    }
}
public class DiceOutput() {

    public static void main(String[] args) {
        Dice d1 = new Dice();
        Dice d2 = new Dice();

        d1.rollDice();
        d2.rollDice();

        System.out.println(d1+d2);
    }

}
