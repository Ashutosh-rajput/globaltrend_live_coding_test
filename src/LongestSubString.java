public class LongestSubString {

    public int lengthOfLongestSubstring(String s) {
        int k = 0;
        int j = 0;
        int max = 0;
        String res = "";

        while (k < s.length()) {
            if (!res.contains("" + s.charAt(j))) {
                res = res + s.charAt(j);
            }
            else{
                k++;
                System.out.println(k);
                System.out.println(res);
                if (res.length() > max) {
                    max = res.length();
                }
                res=res.substring(1);
                System.out.println(res);
                j--;
            }
            j++;
            if (j == s.length()) {
                k++;
                j = k;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        LongestSubString solution = new LongestSubString();

        // Test cases
        String test1 = "aab";
        String test2 = "bbbbb";
        String test3 = "pwwkew";

        System.out.println("Length of the longest substring without repeating characters in \"" + test1 + "\": " + solution.lengthOfLongestSubstring(test1));
        System.out.println("Length of the longest substring without repeating characters in \"" + test2 + "\": " + solution.lengthOfLongestSubstring(test2));
        System.out.println("Length of the longest substring without repeating characters in \"" + test3 + "\": " + solution.lengthOfLongestSubstring(test3));
    }
}
