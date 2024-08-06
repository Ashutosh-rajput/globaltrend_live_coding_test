public class trlaingzero {
    public static void main(String args[]){
        int fac=25;
        int count=0;
        int two=0;
        int five=0;
        while (fac>0){
            if(fac%10==0){
                count++;
            } else if (fac%2==0) {
                two++;
            } else if (fac%5==0) {
                five++;
            }

            fac--;
        }
        count= count+ ((two>five) ? (five):(two));
        System.out.println(count);
    }
}
