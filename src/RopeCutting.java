public class RopeCutting {
    int Cutting(int n,int a, int b, int c){
        int count=0;
        if(n==0){
            return 0;
        }
        if(n<0){
            return -1;
        }
        int res=Math.max(Cutting(n-a,a,b,c),Math.max(Cutting(n-b,a,b,c),Cutting(n-c,a,b,c)));
//        count=1+Math.max(Cutting(n-a,a,b,c),Math.max(Cutting(n-b,a,b,c),Cutting(n-c,a,b,c)));
        if(res==-1){
            return -1;
        }
        return res+1;
    }

    public static void main(String[] args) {
        RopeCutting ropeCutting=new RopeCutting();
        System.out.println(ropeCutting.Cutting(23,12,9,11));
    }
}
