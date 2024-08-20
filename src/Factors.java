import java.util.HashSet;

public class Factors {
    public static void findNumbersWithFactors(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int num : set) {
            for (int i = 1; i*i <= num; i++) {
                if (num % i == 0) {
                    if (i != num && set.contains(i)) {
                        System.out.println(num+" "+i);
                    }
                    int oth = num / i;
                    if (oth != num && oth != i && set.contains(oth)) {
                        System.out.println(num+" "+ oth);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        // Example array of numbers
        int[] numbers = {10, 20, 5, 2, 4, 25};

        findNumbersWithFactors(numbers);
    }
}
