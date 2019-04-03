import java.util.Random;

public class Cruiser extends Starship implements IsOffense{

    public Cruiser(String Name){

        Random rand = new Random();
        name = Name;

        hull = 2000 + (rand.nextInt(500)+1);
        shield = 2000 + (rand.nextInt(500)+1);
        beam = 3000 + (rand.nextInt(1000)+1);
        torpedo = 10 + (rand.nextInt(15)+1);
        System.out.println();
        System.out.println();
        System.out.printf("%s:      Hull: %d    Shields: %d    Beam Weapons: %d    Torpedoes: %d", Name,hull,shield,beam,torpedo);
        System.out.println();
        System.out.println();
    }
}
