public class SellStock1 {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        int max=0;
        int pre=arr[0];
        int curmax=0;
        int buy=arr[0];

        for (int i = 1; i < arr.length ; i++) {
            if(pre<arr[i]){
                curmax=arr[i]-buy;
                pre=arr[i];

            }
            else{
                max=max+curmax;
                pre=arr[i];
                buy=arr[i];
                curmax=0;
            }
        }
        max=max+curmax;
        System.out.println(max);
    }
}
