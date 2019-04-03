import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        System.out.println("Fleet:");
        System.out.println();
        System.out.println();
        ArrayList<Starship> fleet = new ArrayList<Starship>();
        ArrayList<Starship> offense = new ArrayList<Starship>();
        ArrayList<Starship> deffense = new ArrayList<Starship>();
        String a[] =  new String[]{"California","Nevada","Washington","New York","Vermont","Deleware","Conneticut","Illinois","Georgia","South Dakota","Canada","Britan","Florida","Montana","Iowa","TEXAS","Alabama","N Dakota","Nebrasla","Hawwaii"};
        for(int i=0;i<5;i++) {
            fleet.add(new Escort(a[i]));
        }
        System.out.println();
        System.out.println();
        for(int i=5;i<10;i++) {
            fleet.add(new Frigate(a[i]));
        }
        System.out.println();
        System.out.println();
        for(int i=10;i<15;i++) {
            fleet.add(new Cruiser(a[i]));
        }
        System.out.println();
        System.out.println();
        for(int i=15;i<20;i++) {
            fleet.add(new Battleship(a[i]));
        }
        System.out.println();
        System.out.println();
        System.out.printf("\nNumber of Ships: %d",fleet.size());
    }
}
