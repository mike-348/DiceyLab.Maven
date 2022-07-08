import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimulationTest {

    @Test
    void starsTest() {
        //given
        Simulation s = new Simulation(2, 100);
        double percent = 0.01;

        //when
        String stars = s.stars(percent);

        //then
        stars.equals("*");
    }

    @Test
    void starsTest1() {
        //given
        Simulation s = new Simulation(2, 100);
        double percent = 0.09;

        //when
        String stars = s.stars(percent);

        //then
        stars.equals("*********");
    }
}