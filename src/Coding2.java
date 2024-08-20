public class Coding2 {
    public static void codingjava(String s) {
        for (int i = 0; i < s.length(); i++) {
            int temp=s.charAt(i);
            int val=temp+15;

            if(val>90){
                System.out.println((char)(val-26));
            }
            else {
                System.out.println((char)val);
            }
        }
    }

    public static void main(String[] args) {
        codingjava("ABCDZ");

    }
}
