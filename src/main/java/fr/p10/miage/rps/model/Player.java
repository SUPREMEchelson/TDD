package fr.p10.miage.rps.model;
import java.util.ArrayList;
import java.util.List;


public class Player {
    public  Player(String Name, ArrayList<RPSEnum> collection){
        this.Name = Name;
        this.collection = collection;

    }
    public Player(String Name){
        this.Name =Name;
        this.collection = new ArrayList<RPSEnum>();
        for (int i=0; i<tailleListeMouvement; i++) {
            collection.add(RPSEnum.aleatoire());
        }
    }
    public String getName(){
        return Name;
    }
    public int getScore(){
        return Score;
    }
    public static int getTailleListeMouvement(){
        return tailleListeMouvement;
    }
    public RPSEnum getNextMove(){
        if (collection.isEmpty()){
            return  null;
        } else{
            return collection.remove(0);
        }
    }
    public void setScore(int score){
        this.Score = score;
    }


    String Name;
    Integer Score;
    ArrayList<RPSEnum>  collection;
    private static final int tailleListeMouvement = 10;

}