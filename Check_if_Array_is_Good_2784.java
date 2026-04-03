class Solution {
    public boolean isGood(int[] nums) {

        int n = nums.length;
        int[] look = new int[n];

        for (int i = 0; i < n; i++) {
            if (nums[i] >= n)
                return false;
            look[nums[i]]++;
        }

        for (int i = 1; i < n - 1; i++) {
            if (look[i] != 1) {
                return false;
            }
        }

        if (look[n - 1] != 2) {
            return false;
        }

        return true;
    }
}