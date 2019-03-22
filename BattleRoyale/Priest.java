import java.util.Random;
public class Priest extends Player{
    String name;
    private int charisma;
    public Priest(String newName) {
        name = newName;
        Random rand = new Random();
        strength = 7 + (rand.nextInt(6) + 1);
        intelligence = 15 + (rand.nextInt(6) + 1);
        agility = 8 + (rand.nextInt(6) + 1);
        charisma = 10 + (rand.nextInt(6) + 1);
        hp = hpmax = (strength);
        mp = mpmax = (intelligence + 2 * charisma);
    }
    public void stats() {
        System.out.printf("%s, a Priest:\n", name);
        System.out.printf("CHA: %3d \n", charisma);
        super.stats();
    }
}



