import java.util.HashSet;

public class Coding3 {
    public static void codingjava(String s) {
        for (int i = 0; i < s.length(); i++) {
            char val=(char) ('A' + ('Z' - s.charAt(i)));
                System.out.println((char)val);
        }
    }
    public static void main(String[] args) {
        codingjava("ABCDZ");

    }
}
