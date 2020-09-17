package fr.p10.miage.rps.model;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class RockPaperScissorsTest {
RockPaperScissors rps;

    @org.testng.annotations.BeforeMethod
    public void setUp() {
        rps = new RockPaperScissors();

    }

    @org.testng.annotations.AfterMethod
    public void tearDown() {
        rps = null;
    }

    @Test
    public void testPlay() {
        assertEquals(rps.play(RPSEnum.PAPER,RPSEnum.ROCK), Result.WIN);
    }
}