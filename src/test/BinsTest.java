import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BinsTest {

    @Test
    public void createBins_1dice(){
        //given
        Dice d1 = new Dice(1);
        Bins b = new Bins(1, 6);

        //when
        b.createBins();

        //then
        Assertions.assertEquals(b.getBin(2), 0);

    }

    @Test
    public void createBins_1dice2(){
        //given
        Dice d1 = new Dice(1);
        Bins b = new Bins(1, 6);

        //when
        b.createBins();
        b.incrementBin(6);
        b.incrementBin(6);

        //then
        Assertions.assertEquals(b.getBin(6), 2);

    }

    @Test
    public void createBinsTest1(){
        //given
        Dice d1 = new Dice(2);
        Bins b = new Bins(2, 12);

        //when
        b.createBins();
        b.incrementBin(12);
        b.incrementBin(12);

        //then
        Assertions.assertEquals(b.getBin(12), 2);

    }

    @Test
    public void createBinsTest2(){
        //given
        Dice d1 = new Dice(2);
        Bins b = new Bins(2, 12);

        //when
        b.createBins();
        int result = d1.tossAndSum();
        b.getBin(result);
        b.incrementBin(result);

        //then
        Assertions.assertEquals(1, b.getBin(result));

    }

}