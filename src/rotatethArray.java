public class rotatethArray {
    public static void main(String[] args) {
        int arr[]={3,5,2,35,1,25,7};
        int i=0;
        int j=1;
        int d=4;
        while(d>0){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
                j++;
                if(j== arr.length){
                    i=0;
                    j=1;
                    d--;
                }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);

        }
    }

}
