package fr.p10.miage.rps.model;

public class RockPaperScissors {
    Result play(RPSEnum p1, RPSEnum p2){

        if(p1 == RPSEnum.PAPER && p2 == RPSEnum.ROCK) {return Result.WIN;}
        if(p1 == RPSEnum.ROCK && p2 == RPSEnum.SCISSORS){ return Result.WIN;}
        if(p1 == RPSEnum.SCISSORS && p2 == RPSEnum.PAPER) { return Result.WIN;}

        if(p1 == RPSEnum.PAPER && p2 == RPSEnum.PAPER){return Result.TIE;}
        if(p1 == RPSEnum.ROCK && p2 == RPSEnum.ROCK){return Result.TIE;}
        if(p1 == RPSEnum.SCISSORS && p2 == RPSEnum.SCISSORS){return Result.TIE;}

        if(p1 == RPSEnum.PAPER && p2 == RPSEnum.SCISSORS){return Result.LOST;}
        if(p1 == RPSEnum.ROCK && p2 == RPSEnum.PAPER){ return Result.LOST;}
        return Result.LOST;
    }
    Result play (Player p1, Player p2 ) {
        /*int i,taille =10;
        for(i=0; i<10; i++){
        }*/

        Result  resultat = play(p1.getNextMove(), p2.getNextMove());
        if (resultat == Result.WIN) {
            p1.Score =+1;
        }
        if (resultat == Result.TIE) {
            p1.Score =+1;
            p2.Score =+1;
        }
        return resultat;

    }

}

