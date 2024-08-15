public class palindromerecursion  {
    int palin(String s){
        int a=0;
        int b=s.length()-1;
        if(s.charAt(a)!=s.charAt(b)){
            return -1;
        }
        if(a==b || a+1==b){
            return 0;
        }
        return palin(s.substring(1,s.length()-1));
    }

    public static void main(String[] args) {
        palindromerecursion palindromerecursi=new palindromerecursion();
        System.out.println(palindromerecursi.palin("chahc"));

    }
}
