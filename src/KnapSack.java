public class KnapSack {
    static int knapscak(int cap, int w[], int v[], int n){

        if(n==0 || cap==0){
            return 0;
        }
        if(w[n-1]>cap){
            return knapscak(cap,w,v,n-1);
        }
        else
            return Math.max(v[n-1]+knapscak(cap-w[n-1],w,v,n-1),knapscak(cap,w,v,n-1));

    }
    public static void main(String[] args){
        int [] w={1,2,3};
        int[] v={10,15,40};
        int cap=6;
        int n=v.length;

        System.out.println(knapscak(cap,w,v,n));

    }
}
