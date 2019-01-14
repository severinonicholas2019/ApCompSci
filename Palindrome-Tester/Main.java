public class Main {
    public static void main(String[] args) {
        Tester("Palindrome");
        Tester("Civic");
        Tester("Radar");
        Tester("Level");
        Tester("Eva, can I stab bats in a cave?");
        Tester("A man, a plan, a canal, Panama");
        Tester("Mr. Owl ate my metal worm");
        Tester("Never odd or even");
        Tester("Doc, Note: I Dissent. A fast never prevents a fatness. I diet on cod.");
    }

    public static void Tester(String a) {
        String b = Remove(a);
        String c = Reverse(b);
        boolean d = Checke(c,b);
        if (d) {
            System.out.println("\"" + a + "\" is a palindrome. \n"); }
        else {System.out.println("\"" + a + "\" is NOT a palindrome. \n");}
    }

    public static String Remove(String a) {
        String b = "";
        String c = "";
        char d = 1;
        a = a.toLowerCase();
        int length = a.length();
        for (int i = 0; i < length; i++) {
            if (a.charAt(i) >= 97 && a.charAt(i) <= 122) {
                d = (a.charAt(i));
                c = Character.toString(d);
                b += c;
            }
        }
        return b;
    }

    public static String Reverse(String b) {
        String c = "";
        char d = 1;
        int length = b.length();
        for (int i = 0; i < length; i++) {
            d = b.charAt((length-1) - i);
            c += Character.toString(d);
        }
        return c;
    }

    public static boolean Checke(String c, String b) {
        boolean equality = false;
        if (c.equals(b)) {equality = true;}
        return equality;
    }
}
