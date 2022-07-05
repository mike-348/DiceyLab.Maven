import java.util.Random;

public class Dice {

    public int numOfRolls;
    public int toss;

    public Dice(Integer numOfRolls) {
        this.numOfRolls = numOfRolls;
    }

    public int tossAndSum(){
        Random r = new Random();

        int sum = 0;

        for (int i = 0; i < numOfRolls; i++) {
            numOfRolls += (6 * Math.random() + 1);
            i++;
        }
        return sum;
    }

    public static void main (String[] args) {
        Random r = new Random();

        int result = 0;

        for(int i = 0; i < 50; i++) {
            result = r.nextInt(6);
            result++;
            System.out.println(result);
        }

    }

}