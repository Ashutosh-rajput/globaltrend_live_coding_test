public class largetelementinarray {
    public static void main(String[] args) {
        int arr[]={97,38,93,93,22};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
