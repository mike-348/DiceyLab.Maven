import java.util.ArrayList;
import java.util.Collections;

public class Bins {

    static ArrayList<Integer> bins;
    private int minBin;
    private int maxBin;
    public Bins(int minBin, int maxBin) {
        this.minBin = minBin;
        this.maxBin = maxBin;
    }

    //create an array list with 12 elements, all 0;
    public void createBins() {
        bins = new ArrayList<Integer>();
        for (int i = minBin; i < maxBin+10; i++){
            bins.add(0);
        }
    }

    public void incrementBin(int binNum) {
        bins.set(binNum-2, getBin(binNum)+1);
    }

    public Integer getBin(int binNum) {
        return bins.get(binNum - 2);
    }

}
