package fr.p10.miage.rps.model;
import java.util.ArrayList;
import java.util.List;


public class Player {
    public Player(){

    }
    public  Player(String Name, ArrayList<RPSEnum> collection){
        this.Name = Name;
        this.collection = collection;

    }
    public Player(String Name){
        this.Name =Name;
        this.collection = collection;
    }
       /* List<Integer> givenList = Arrays.asList(1, 2, 3);
        Random rand = new Random();
        int randomElement = givenList.get(rand.nextInt(givenList.size()));

        */
    }
    String Name;
    Integer Score;
    ArrayList<RPSEnum>  collection = new ArrayList<RPSEnum>();

}
