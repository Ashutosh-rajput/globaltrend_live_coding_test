public class BalancedPosition {

    public static int findBalancedPosition(int[] arr) {
        int tsum = 0;
        for (int i = 0; i < arr.length; i++) {
            tsum= tsum+arr[i];
        }
        int lsum = 0;
        for (int i = 0; i < arr.length; i++) {
            lsum+=arr[i];
            int rsum = tsum-lsum;
            if (lsum == rsum) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,3,4,6,2};
        int[] arr2 = {23, 5, 8, 32, 55, 87};

        int position1 = findBalancedPosition(arr1);
        int position2 = findBalancedPosition(arr2);

        System.out.println("Balanced position for arr1: " + position1);  // Output: -1
        System.out.println("Balanced position for arr2: " + position2);  // Output: -1
    }
}
