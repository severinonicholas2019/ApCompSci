import java.util.Random;
public class Fighter extends Player {
    String name;
    private int constitution;
    public Fighter(String newName){
        name = newName;
        Random rand = new Random();
        strength = 15 + (rand.nextInt(6)+1);
        intelligence = 7 + (rand.nextInt(6)+1);
        agility = 8 + (rand.nextInt(6)+1);
        constitution = 10 + (rand.nextInt(6)+1);
        hp = hpmax = (strength*2)+(2*constitution);
        mp = mpmax = 0;
    }
    public void stats() {
        System.out.printf("%s, a Fighter:\n", name);
        System.out.printf("CON: %3d \n", constitution);
        super.stats();
    }
}
