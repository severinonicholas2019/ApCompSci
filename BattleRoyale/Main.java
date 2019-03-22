
import  java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Fighter player1 = new Fighter("Nick");
        player1.stats();
        System.out.println("There are, "+Player.numCharacters()+" characters\n");
        Paladain player2 = new Paladain("Avani");
        player2.stats();
        System.out.println("There are, "+Player.numCharacters()+" characters\n");
        Priest player3 = new Priest("Pickles");
        player3.stats();
        System.out.println("There are, "+Player.numCharacters()+" characters\n");
        Mage player4 =new Mage("Tajin");
        player4.stats();
        System.out.println("There are, "+Player.numCharacters()+" characters\n");
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(new Fighter ("Nick"));
        players.add(new Paladain("Avani"));
        players.add(new Priest("Pickles"));
        players.add(new Mage("Tajin"));
    }
}
