public class SumOfdidgetRecurrsion {
    int adddigit(int a){
        int n=0;
        if(a==0){
            return 0;
        }
        return a%10+adddigit(a/10);
    }

    public static void main(String[] args) {
        SumOfdidgetRecurrsion sumOfdidgetRecurrsion=new SumOfdidgetRecurrsion();
        System.out.println(sumOfdidgetRecurrsion.adddigit(670000));
    }
}
