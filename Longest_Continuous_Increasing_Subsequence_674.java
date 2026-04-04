class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0)
            return 0;

        int maxxy = 1;
        int changee = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                changee++;
            } else {
                changee = 1;
            }
            maxxy = Math.max(maxxy, changee);
        }
        return maxxy;
    }
}