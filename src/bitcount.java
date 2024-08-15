public class bitcount {
    public static void main(String[] args) {
        int n=13;
        int count=0;
        for(int i=0;i<32;i++){
            int x=1<<i;
            if((n & x)!=0){
                count++;
            }
        }
        System.out.println(count);
    }
}
