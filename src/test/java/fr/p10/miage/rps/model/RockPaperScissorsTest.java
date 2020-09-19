package fr.p10.miage.rps.model;
import org.testng.annotations.DataProvider;
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
        assertEquals(rps.play(RPSEnum.PAPER,RPSEnum.PAPER), Result.TIE);
    }
    @Test
    public void testLostPlay(){
        assertEquals(rps.play(RPSEnum.PAPER,RPSEnum.SCISSORS),Result.LOST);
    }

    @Test(dataProvider = "WinData")
    public void wintest(RPSEnum p1, RPSEnum p2)
    {
        assertEquals((rps.play(p1,p2)),Result.WIN);
    }

    @DataProvider(name="WinData")
    public Object[][] getData1()
    {
        Object[][] data1 = { {RPSEnum.PAPER,RPSEnum.ROCK}, {RPSEnum.ROCK,RPSEnum.SCISSORS}, {RPSEnum.SCISSORS,RPSEnum.PAPER}};
       return data1;
    }


    @Test(dataProvider = "TieData")
    public void tietest(RPSEnum p1, RPSEnum p2)
    {
        assertEquals((rps.play(p1,p2)),Result.TIE);
    }

    @DataProvider(name="TieData")
    public Object[][] getData2()
    {
        Object[][] data2 = { {RPSEnum.PAPER,RPSEnum.PAPER}, {RPSEnum.ROCK,RPSEnum.ROCK}, {RPSEnum.SCISSORS,RPSEnum.SCISSORS}};
        return data2;
    }


    @Test(dataProvider = "LostData")
    public void losttest(RPSEnum p1, RPSEnum p2)
    {
        assertEquals((rps.play(p1,p2)),Result.LOST);
    }

    @DataProvider(name="LostData")
    public Object[][] getData3()
    {
        Object[][] data3 = { {RPSEnum.PAPER,RPSEnum.SCISSORS}, {RPSEnum.ROCK,RPSEnum.PAPER}, {RPSEnum.SCISSORS,RPSEnum.ROCK}};
        return data3;
    }
}