package fr.p10.miage.rps.model;
import org.testng.annotations.Parameters;

public class RockPaperScissors {
    Result play(RPSEnum p1, RPSEnum p2){
        if(p1 == RPSEnum.PAPER && p2 == RPSEnum.ROCK) {return Result.WIN;}

        if(p1 == RPSEnum.PAPER && p2 == RPSEnum.PAPER){
            return Result.WIN;
        }
        if(p1 == RPSEnum.PAPER && p2 == RPSEnum.SCISSORS){
            return Result.LOST;
        }
        return Result.LOST;

    }
}

