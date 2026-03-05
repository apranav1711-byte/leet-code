class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int min_length = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            while (sum >= target) {
                min_length = Math.min(min_length, i - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return min_length == Integer.MAX_VALUE ? 0 : min_length;
    }
}