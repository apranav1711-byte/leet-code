class Solution {
    public int smallestIndex(int[] nums) {

        int s = 1001;
        for (int i = 0; i < nums.length; i++) {
            if (sum(nums[i]) == i) {
                s = Math.min(s, i);
            }
        }
        if (s == 1001) {
            return -1;
        } else {
            return s;
        }
    }

    private int sum(int k) {
        int temp = k;
        int sum = 0;
        while (temp > 0) {
            int rem = temp % 10;
            sum += rem;
            temp /= 10;
        }
        return sum;
    }
}