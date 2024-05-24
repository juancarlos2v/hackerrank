package JavaPreparation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Player{
     String name;
     int score;

    Player(String name,int score){
        this.name=name;
        this.score=score;
    }

}

class Checker implements Comparator<Player> {

    @Override
    public int compare(Player p1,Player p2) {
        if (p1.score== p2.score){
            return p1.name.compareTo(p2.name);
        }
        return Integer.compare(p1.score,p2.score);
    }
}

public class JavaComparator {
    public static void main(String[] args) {
        Player p1=new Player("Jose",20);
        Player p2=new Player("Ana",10);
        Player p3=new Player("Ana",20);

        List<Player> players=new ArrayList<>();

        players.add(p1);
        players.add(p2);
        players.add(p3);

        for (Player p:players
        ) {
            System.out.println(p.name+" "+p.name);
        }

        System.out.println("-------------------");
        players.sort(new Checker());

        for (Player p:players
        ) {
            System.out.println(p.name+" "+p.score);
        }
    }




}
