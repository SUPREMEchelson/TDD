package fr.p10.miage.rps.model;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.*;

public class RockPaperScissorsTest {
    RockPaperScissors rps;
    ArrayList<RPSEnum> movPaper;
    ArrayList<RPSEnum> movRock;
    ArrayList<RPSEnum> movScissors;

    @org.testng.annotations.BeforeClass
    public void setUp() {
        rps = new RockPaperScissors();

    }

    @org.testng.annotations.AfterClass
    public void tearDown() {
        rps = null;
    }

    @Test
    void testWinPlay() {
        assertEquals(rps.play(RPSEnum.PAPER, RPSEnum.ROCK), Result.WIN);
    }

    @Test
    public void testTieplay() {
        assertEquals(rps.play(RPSEnum.PAPER, RPSEnum.PAPER), Result.TIE);
    }

    @Test
    public void testLostPlay() {
        assertEquals(rps.play(RPSEnum.PAPER, RPSEnum.SCISSORS), Result.LOST);
    }


    @Test(dataProvider = "WinData")
    public void wintest(RPSEnum p1, RPSEnum p2) {
        assertEquals((rps.play(p1, p2)), Result.WIN);
    }

    @DataProvider(name = "WinData")
    public Object[][] getData1() {
        Object[][] data1 = {{RPSEnum.PAPER, RPSEnum.ROCK}, {RPSEnum.ROCK, RPSEnum.SCISSORS}, {RPSEnum.SCISSORS, RPSEnum.PAPER}};
        return data1;
    }


    @Test(dataProvider = "TieData")
    public void tietest(RPSEnum p1, RPSEnum p2) {
        assertEquals((rps.play(p1, p2)), Result.TIE);
    }

    @DataProvider(name = "TieData")
    public Object[][] getData2() {
        Object[][] data2 = {{RPSEnum.PAPER, RPSEnum.PAPER}, {RPSEnum.ROCK, RPSEnum.ROCK}, {RPSEnum.SCISSORS, RPSEnum.SCISSORS}};
        return data2;
    }


    @Test(dataProvider = "LostData")
    public void losttest(RPSEnum p1, RPSEnum p2) {
        assertEquals((rps.play(p1, p2)), Result.LOST);
    }

    @DataProvider(name = "LostData")
    public Object[][] getData3() {
        Object[][] data3 = {{RPSEnum.PAPER, RPSEnum.SCISSORS}, {RPSEnum.ROCK, RPSEnum.PAPER}, {RPSEnum.SCISSORS, RPSEnum.ROCK}};
        return data3;
    }

    @org.testng.annotations.BeforeClass
    public void setUpClass(){
         movPaper = new ArrayList<RPSEnum>();
         movRock = new ArrayList<RPSEnum>();
         movScissors = new ArrayList<RPSEnum>();
    }

    @org.testng.annotations.AfterClass
    public void tearDownClass(){
         movPaper = null;
         movRock = null;
         movScissors = null;
    }

    @Test(dataProvider = "WinDataPlay")
    public void WintestPlay(Player p1, Player p2) {
        assertEquals((rps.play(p1, p2)), Result.WIN);
    }

    @DataProvider(name = "WinDataPlay")
    public Object[][] getDataPlay1() {
        movPaper = new ArrayList<RPSEnum>();
        movRock = new ArrayList<RPSEnum>();
        movScissors = new ArrayList<RPSEnum>();

        movPaper.add(RPSEnum.PAPER);
        movRock.add(RPSEnum.ROCK);
        movScissors.add(RPSEnum.SCISSORS);

        Object[][] dataPlay1 = {{new Player("chelson", movScissors), new Player("mathieu", movPaper)},
                {new Player("Paul", movRock), new Player("Lionnel", movScissors)},
                {new Player("Jean", movPaper), new Player("James", movRock)}};
        return dataPlay1;
    }


    @Test(dataProvider = "TieDataPlay")
    public void TietestPlay(Player p1, Player p2)
    {
        assertEquals((rps.play(p1,p2)),Result.TIE);
    }

    @DataProvider(name="TieDataPlay")
    public Object[][] getDataPlay2() {
         movPaper = new ArrayList<RPSEnum>();
         movRock = new ArrayList<RPSEnum>();
         movScissors = new ArrayList<RPSEnum>();



        movPaper.add(RPSEnum.PAPER);
        movRock.add(RPSEnum.ROCK);
        movScissors.add(RPSEnum.SCISSORS);
        Object[][] dataPlay2 = { {new Player("Marc",movScissors) ,new Player("Pierre",movScissors)},
                {new Player("sofiane",movRock), new Player("luc",movRock)},
                { new Player("robert",movPaper), new Player("antoine",movPaper) }};
        return dataPlay2;
    }

    @Test(dataProvider = "LostDataPlay")
    public void LosttestPlay(Player p1, Player p2)
    {
        assertEquals((rps.play(p1,p2)),Result.LOST);
    }

    @DataProvider(name="LostDataPlay")
    public Object[][] getDataPlay3() {
         movPaper = new ArrayList<RPSEnum>();
         movRock = new ArrayList<RPSEnum>();
         movScissors = new ArrayList<RPSEnum>();



        movPaper.add(RPSEnum.PAPER);
        movRock.add(RPSEnum.ROCK);
        movScissors.add(RPSEnum.SCISSORS);

        Object[][] dataPlay3 = { {new Player("Mathieu",movPaper) ,new Player("chelson",movScissors)},
                {new Player("Paul",movRock), new Player("Lionel",movPaper)},
                { new Player("Jean",movScissors), new Player("James",movRock) }};
        return dataPlay3;


    }


}