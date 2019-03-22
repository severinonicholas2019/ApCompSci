import java.util.Random;
public class Mage extends Player{
    String name;
    private int wisdom;
    public Mage(String newName) {
        name = newName;
        Random rand = new Random();
        strength = 7 + (rand.nextInt(6) + 1);
        intelligence = 15 + (rand.nextInt(6) + 1);
        agility = 8 + (rand.nextInt(6) + 1);
        wisdom = 10 + (rand.nextInt(6) + 1);
        hp = hpmax = (strength);
        mp = mpmax = (intelligence + 2 * wisdom);
    }
    public void stats() {
        System.out.printf("%s, a Mage:\n", name);
        System.out.printf("WIS: %3d \n", wisdom);
        super.stats();
    }
}
