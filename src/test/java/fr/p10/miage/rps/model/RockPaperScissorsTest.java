package fr.p10.miage.rps.model;
import fr.p10.miage.rps.model.RPSEnum;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class RockPaperScissorsTest {
RockPaperScissors rps;

    @org.testng.annotations.BeforeClass
    public void setUp() {
        rps = new RockPaperScissors();

    }

    @org.testng.annotations.AfterClass
    public void tearDown() {
        rps = null;
    }
    @Test
     void testWinPlay(){
        assertEquals(rps.play(RPSEnum.PAPER,RPSEnum.ROCK), Result.WIN);
    }
    @Test
    public void testTieplay(){
        assertEquals(rps.play(RPSEnum.PAPER,RPSEnum.PAPER), Result.WIN);
    }
    @Test
    public void testLostPlay(){
        assertEquals(rps.play(RPSEnum.PAPER,RPSEnum.SCISSORS),Result.LOST);
    }

}