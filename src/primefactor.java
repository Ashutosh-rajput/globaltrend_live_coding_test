public class primefactor {
    public static void main(String[] args) {
        int n=1092;
        int i=2;
        int flag=0;
        String res="";
        while (i<=n){
            if(n%i==0){
                flag=1;

                n=n/i;
            }
            else if(n%i!=0){
                if(flag==1){
                    res=res+i+" ";
                    flag=0;
                }
                res=res+i+" ";
                i++;
            }
        }
        System.out.println(res);
    }
}
