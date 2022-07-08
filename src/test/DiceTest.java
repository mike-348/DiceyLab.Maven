import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DiceTest {

    @org.junit.jupiter.api.Test
    public void rollDiceTestMin() {
        //given
        Dice d = new Dice(2);

        //when
        int sumOfDice = d.tossAndSum();

        //then
        int min = 2;
        int max = 12;
        System.out.print(sumOfDice);
        Assertions.assertTrue(sumOfDice <= max);
    }

    @Test
    public void rollDiceTestMax() {
        //given
        Dice d = new Dice(4);

        //when
        int sumOfDice = d.tossAndSum();

        //then
        int min = 4;
        int max = 24;
        System.out.print(sumOfDice);
        Assertions.assertTrue(sumOfDice >= min);
    }

}