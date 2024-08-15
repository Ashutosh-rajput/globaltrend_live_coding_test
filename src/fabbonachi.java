public class fabbonachi {
    int fabbno(int n){
        if(n<0){
            return 0;
        }
        return n+fabbno(n-1);
    }

    public static void main(String[] args) {
        fabbonachi fabbona=new fabbonachi();
        System.out.println(fabbona.fabbno(20));
    }
}
