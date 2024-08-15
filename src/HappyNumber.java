import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

        public boolean isHappy(int n) {
            Set<Integer> uniqueNumbers = new HashSet<>();

            int num = n;
            Boolean flag = false;
            System.out.println(num);
            while (uniqueNumbers.add(num)) {
                int temp = 0;
//                System.out.println(num);
                while (num > 0) {
                    temp = temp + ((num % 10) * (num % 10));
                    num = num / 10;
                }

                num = temp;
                System.out.println(num +" and  "+temp);
                if (num == 1) {
                    flag = true;
                    break;
                }
            }
            return flag;
        }

        public static void main(String[] args) {
            HappyNumber solution = new HappyNumber();
            int n = 19;  // Example number
            boolean result = solution.isHappy(n);
            System.out.println("Is " + n + " a happy number? " + result);
        }
    }


