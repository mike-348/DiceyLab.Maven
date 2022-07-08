import sun.lwawt.macosx.CSystemTray;

import java.util.ArrayList;
import java.util.List;

public class Simulation {

    private int numberOfDies;
    private int numberOfTosses;


    public Simulation(int numberOfDies, int numberOfTosses) {
        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
    }

    public Bins runSimulation() {
        Bins b = new Bins(numberOfDies, numberOfDies * 6);
        b.createBins();
        Dice d = new Dice(numberOfDies);
        for (int i = 0; i < numberOfTosses; i++) {
            b.incrementBin(d.tossAndSum());
        }
        return b;
    }

    public String stars(double num) {
        String stars = "";
        for (double i = 0; i < num; i+=0.01){
            stars += "*";
        }

        return stars;
    }


    public void printResults() {
        System.out.println("***");
        System.out.println("Simulation of " + numberOfDies + " dice tossed for " + numberOfTosses + " times.");
        System.out.println("***\n");
        for(int i = numberOfDies; i <= numberOfDies * 6; i++) {
            int bins = runSimulation().getBin(i);
            double percent = Double.valueOf(runSimulation().getBin(i))/numberOfTosses;
            String stars = stars(percent);
            System.out.println(String.format("%2d: %7d: %.2f %s", i, bins, percent, stars));
        }

    }

    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 1000000);
        sim.runSimulation();
        sim.printResults();
    }

}

