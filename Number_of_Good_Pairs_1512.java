import java.util.*;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            set.add(nums[i]);
        }
        int result = 0;
        for (Integer value : set) {
            int p = map.get(value);
            if (p >= 2) {
                result += formu(p);
            }
        }
        return result;
    }

    private int formu(int k) {
        int s = k * (k - 1) / 2;
        return s;
    }
}