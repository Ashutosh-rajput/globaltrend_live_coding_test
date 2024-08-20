public class SortedFreqinArray {
    public static void main(String[] args) {
        int arr[]={10,10,10,20,20,30,30,40,50,60,60,60};
        int count=1;
        int pre=arr[0];
        for(int i=1;i< arr.length;i++){
            if(pre==arr[i]){
                count++;
            }
            else {
                System.out.println(pre + " " + count);
                pre = arr[i];
                count = 1;
            }
        }
        System.out.println(pre+" "+count);
    }
}
