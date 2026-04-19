class Solution {
    public int averageValue(int[] nums) {
        int sol = 0;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 6 == 0) {
                sol += nums[i];
                k++;
            }
        }

        return (k == 0) ? sol : sol / k;

    }
}