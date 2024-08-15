public class LeadersInArray {
    public static void main(String[] args) {
        int []arr={7,10,4,3,6, 10,5,2};
        int max=0;
        for (int i = arr.length-1; i >=0 ; i--) {
            if(arr[i]>max){
                System.out.println(arr[i]);
                max=arr[i];
            }

        }
    }
}
