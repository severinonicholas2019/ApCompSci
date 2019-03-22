import java.util.Random;
public class Paladain extends Player{
    String name;
    private int constitution;
    private int wisdom;
    public Paladain(String newName){
        name = newName;
        Random rand = new Random();
        strength = 10 + (rand.nextInt(6)+1);
        intelligence = 15 + (rand.nextInt(6)+1);
        agility = 5 + (rand.nextInt(6)+1);
        wisdom = 10 + (rand.nextInt(6)+1);
        constitution = 10 + (rand.nextInt(6)+1);
        hp = hpmax = (strength)+(2*constitution);
        mp = mpmax = (intelligence+2*wisdom);
    }
    public void stats() {
        System.out.printf("%s, a Paladin:\n", name);
        System.out.printf("CON: %3d \n WIS: %3d \n", constitution, wisdom);
        super.stats();
    }
}
