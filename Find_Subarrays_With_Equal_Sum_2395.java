import java.util.*;

class Solution {
    public boolean findSubarrays(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length - 1; i++) {
            int k = nums[i] + nums[i + 1];
            if (map.containsKey(k)) {
                return true;
            } else {
                map.put(k, i);
            }
        }
        return false;

    }
}