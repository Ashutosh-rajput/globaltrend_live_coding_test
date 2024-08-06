import java.util.Arrays;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] pre = new int[len];
        int[] suf = new int[len];
//        int[] result = new int[len];

        pre[0] = nums[0];
        suf[len - 1] = nums[len - 1];

        for (int i = 1; i < len; i++) {
            pre[i] = pre[i - 1] * nums[i];
        }
        for (int i = len - 2; i >= 0; i--) {
            suf[i] = suf[i + 1] * nums[i];
        }

        nums[0] = suf[1];
        nums[len - 1] = pre[len - 2];

        for (int i = 1; i < len - 1; i++) {
            nums[i] = pre[i - 1] * suf[i + 1];
        }

        return nums;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example input
        int[] nums = {1, 2, 3, 4};

        // Calculate product except self
        int[] result = solution.productExceptSelf(nums);

        // Print the result
        System.out.println(Arrays.toString(result));
    }
}
