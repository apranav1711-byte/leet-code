class Solution {
    public int findFinalValue(int[] nums, int original) {

        HashSet<Integer> hehe = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            hehe.add(nums[i]);
        }

        while (hehe.contains(original)) {
            original *= 2;
        }
        return original;

    }
}
