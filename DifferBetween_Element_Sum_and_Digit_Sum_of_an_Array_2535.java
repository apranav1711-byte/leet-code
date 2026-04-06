class Solution {
    public int differenceOfSum(int[] nums) {

        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int temp = nums[i];
            while (temp > 0) {
                int rem = temp % 10;
                sum1 += rem;
                temp /= 10;
            }
        }
        return sum - sum1;

    }
}