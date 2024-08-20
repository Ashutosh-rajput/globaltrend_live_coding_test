import java.util.HashSet;

public class Coding {
    public static void codingjava(String s) {
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            int temp=s.charAt(i);
            sum=sum+temp%64;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        codingjava("PYTHON");

    }
}
