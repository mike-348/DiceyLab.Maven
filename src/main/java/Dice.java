import java.util.Random;

public class Dice {

    private int dice;

    public Dice(Integer dice) {
        this.dice = dice;
    }

    public int tossAndSum(){

        int result = 0;
        for (int i = 0; i < dice; i++) {
            result += (6 * Math.random() + 1);
        }
        return result;
    }

}