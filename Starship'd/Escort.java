mport java.util.Random;

public class Escort extends Starship {
    public Escort(String Name){
        Random rand = new Random();
        name = Name;
        hull = 1000 + (rand.nextInt(250)+1);
        shield = 2500 + (rand.nextInt(1000)+1);
        beam = 2500 + (rand.nextInt(500)+1);
        torpedo = 10 + (rand.nextInt(10)+1);
        System.out.println();
        System.out.println();
        System.out.printf("%s:      Hull: %d    Shields: %d    Beam Weapons: %d    Torpedoes: %d", Name,hull,shield,beam,torpedo);
        System.out.println();
        System.out.println();

    }
}
