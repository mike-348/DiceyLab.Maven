import java.util.Random;

public class Dice {

    public int dice;
    public int toss;

    public Dice(Integer dice) {
        this.dice = dice;
    }

    public int rollDice(){
        Random r = new Random();

        int sum = 0;

        for (int i = 0; i < dice; i++) {
            sum += (6 * Math.random() + 1);
            i++;
        }
        System.out.println(sum);
        return sum;
    }

}