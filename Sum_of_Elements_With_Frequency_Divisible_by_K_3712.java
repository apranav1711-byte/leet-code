import java.util.*;

class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer, Integer> he = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (he.containsKey(nums[i])) {
                he.put(nums[i], he.get(nums[i]) + 1);
            } else {
                he.put(nums[i], 1);
            }
        }
        int sum = 0;

        for (Integer key : he.keySet()) {
            int count = he.get(key);

            if (count % k == 0) {
                sum += key * count;
            }
        }

        return sum;

    }
}