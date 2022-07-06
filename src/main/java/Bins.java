import javax.management.ObjectInstance;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
public class Bins {

    private int numOfDice;
    private int numOfBins;

    static ArrayList<Integer> bins;

    public Bins(Integer numOfDice, Integer numOfBins) {
        bins = new ArrayList<Integer>();
        for (int i = numOfDice; i <= numOfBins; i++) {
            bins.add(i, 0);
            i++;
        }
    }

    public void sumToBins(int sumOfDice) {
        bins.add(sumOfDice, sumOfDice-1);
    }

    public int getBin(int input) {
        return bins.get(input+1);
    }

}
