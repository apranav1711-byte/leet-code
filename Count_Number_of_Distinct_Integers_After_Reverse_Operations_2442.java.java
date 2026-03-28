import java.util.*;

class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, 1);

            int rev = reverse(num);
            map.put(rev, 1);
        }

        return map.size();
    }

    private int reverse(int num) {
        int rev = 0;

        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        return rev;
    }
}