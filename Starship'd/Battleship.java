import java.util.Random;

public class Battleship extends Starship implements IsOffense{

    public Battleship(String Name){

        Random rand = new Random();
        name = Name;

        hull = 3000 + (rand.nextInt(2000)+1);
        shield = 1500 + (rand.nextInt(500)+1);
        beam = 4000 + (rand.nextInt(1000)+1);
        torpedo = 40 + (rand.nextInt(10)+1);
        System.out.println();
        System.out.println();
        System.out.printf("%s:      Hull: %d    Shields: %d    Beam Weapons: %d    Torpedoes: %d", Name,hull,shield,beam,torpedo);
        System.out.println();
        System.out.println();
    }

}
