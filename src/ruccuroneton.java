public class ruccuroneton {
    void rcurr(int n){
        if(n==0){
            return ;
        }
        rcurr(n-1);
        System.out.println(n);

    }

    public static void main(String[] args) {
        ruccuroneton ruccurone=new ruccuroneton();
        ruccurone.rcurr(5);
    }
}
