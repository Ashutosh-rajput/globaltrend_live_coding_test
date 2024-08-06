public class gcd {
    public static void main(String arga[]){
        int a=200;
        int b=100;
        int temp=((a>b) ? (b):(a));
        int res=-1;
//        System.out.println(temp);
        for(int i=temp;i>0;i--){
            if(a%i==0 && b%i==0){
                res=i;
                break;
            }
        }
        System.out.println(res);
    }
}
