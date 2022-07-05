import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DiceTest {

    @org.junit.jupiter.api.Test
    public void rollDiceTestMin() {
        //given
        Dice d = new Dice();

        //when
        int sumOfDice = d.rollDice();

        //then
        int min = 2;
        int max = 12;
        System.out.print(sumOfDice);
        Assertions.assertTrue(sumOfDice <= max);
    }

    @Test
    public void rollDiceTestMax() {
        //given
        Dice d = new Dice();

        //when
        int sumOfDice = d.rollDice();

        //then
        int min = 2;
        int max = 12;
        System.out.print(sumOfDice);
        Assertions.assertTrue(sumOfDice >= min);
    }

}