public class Killer {
    void Kill(int n, int k, int ki, String sur){
        if(sur.length()==0){
            for(int i=0;i<n;i++){
                sur=sur+i;
            }
        }
        System.out.println(sur+" start");
        if(sur.length()==1){
            System.out.println(sur);
            return;
        }
        int died=(int)sur.charAt(ki+k-1);
        if(died>=n){
            System.out.println(died+" died when greater than n and n also "+n);
            died=died%(n+1);
//            died=died-1;
            System.out.println(died+" died when greater than n after dvide");
        }
        System.out.println(n+" this is n");
        System.out.println(died);
        int ind=sur.indexOf(died+"");
        System.out.println(ind);
        sur=sur.substring(0,ind)+sur.substring(ind+1);
//        System.out.println(died);
        System.out.println(sur+" end");
        Kill(n-1,k,ind+1,sur);

    }

    public static void main(String[] args) {
        Killer killer=new Killer();
        killer.Kill(7,3,0,"");

    }
}
