public class divisor {
    public static void main(String[] args) {
        int a=125;
        System.out.println(1);
        for(int i=2;i*i<=a;i++){
            if(a%i==0){
                int temp=a/i;
                if(temp==i){
                    System.out.println(i);
                }
                else{
                System.out.println(i+"\n"+temp);}
            }
        }
        System.out.println(a);
    }
}
