package fr.p10.miage.rps.model;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;

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
    /*@Test
    public void winplay(){
        ArrayList <RPSEnum> movp1 = new ArrayList<RPSEnum>();
        ArrayList <RPSEnum> movp2 = new ArrayList<RPSEnum>();
        movp1.add(RPSEnum.ROCK);
        movp2.add(RPSEnum.SCISSORS);
        Player p1 = new Player("mathieu", movp1);
        Player p2 = new Player("chelson",movp2);
        assertEquals(rps.play(p1,p2),Result.WIN);


    }*/

    @Test(dataProvider = "WinDataPlay")
    public void WintestPlay(Player p1, Player p2)
    {
        assertEquals((rps.play(p1,p2)),Result.WIN);
    }

    @DataProvider(name="WinDataPlay")
    public Object[][] getDataPlay1()
    {
        ArrayList<RPSEnum> movPaper = new  ArrayList<RPSEnum>();
        ArrayList<RPSEnum> movRock = new  ArrayList<RPSEnum>();
        ArrayList<RPSEnum> movScissors = new  ArrayList<RPSEnum>();

        movPaper.add(RPSEnum.PAPER);
        movRock.add(RPSEnum.ROCK);
        movScissors.add(RPSEnum.SCISSORS);

        Object[][] dataPlay1 = { {new Player("Mathieu",movScissors) ,new Player("chelson",movPaper)},
                {new Player("Paul",movRock), new Player("Lionnel",movScissors)},
                { new Player("Jean",movPaper), new Player("James",movRock) }};
        return dataPlay1;
    }
}