import java.util.*;

class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        back(nums, 0, new ArrayList<>());
        return result;
    }

    private void back(int[] nums, int start, List<Integer> current) {
        result.add(new ArrayList<>(current));

        for (int i = start; i < nums.length; i++) {

            current.add(nums[i]);
            back(nums, i + 1, current);
            current.remove(current.size() - 1);
        }
    }
}