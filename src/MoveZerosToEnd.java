public class MoveZerosToEnd {
    public static void main(String[] args) {
        int arr[]={0,3,5,0,2,0,0,0,3,3,25,7,0,7};
        int i=0;
        int j=1;
        while(j<arr.length){
            if(arr[i]==0 && arr[j]!=0){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
                j++;
            }
            else{
                if (arr[j]==0) {
                    j++;
                }
                if(arr[i]!=0){
                    i++;
                }
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);

        }
    }

}
