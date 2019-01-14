public class Main {
    public static void main(String[] args) {
        palindromeTester("Palindrome");
        palindromeTester("Civic");
        palindromeTester("Radar");
        palindromeTester("Level");
        palindromeTester("Eva, can I stab bats in a cave?");
        palindromeTester("A man, a plan, a canal, Panama");
        palindromeTester("Mr. Owl ate my metal worm");
        palindromeTester("Never odd or even");
        palindromeTester("Doc, Note: I Dissent. A fast never prevents a fatness. I diet on cod.");
    }

    public static void palindromeTester(String a) {
        String b = charRemover(a);
        String c = stringReverser(b);
        boolean d = stringChecker(c,b);
        if (d) {
            System.out.println("\"" + a + "\" is a palindrome. \n"); }
        else {System.out.println("\"" + a + "\" is NOT a palindrome. \n");}
    }

    public static String charRemover(String a) {
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

    public static String stringReverser(String b) {
        String c = "";
        char d = 1;
        int length = b.length();
        for (int i = 0; i < length; i++) {
            d = b.charAt((length-1) - i);
            c += Character.toString(d);
        }
        return c;
    }

    public static boolean stringChecker(String c, String b) {
        boolean equality = false;
        if (c.equals(b)) {equality = true;}
        return equality;
    }
}
