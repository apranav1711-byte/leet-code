import java.util.HashMap;
import java.util.HashSet;

public class Count_Elements_With_Maximum_Frequency_3005 {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int result = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(map.get(nums[i]), max);
        }
        for (int num : set) {
            if (map.get(num) == max) {
                result += max;
            }
        }
        return result;
    }
}
