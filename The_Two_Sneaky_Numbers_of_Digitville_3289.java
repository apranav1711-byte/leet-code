class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] arr = new int[101];
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }
        int k = 0;
        for (int i = 0; i < 101; i++) {
            if (arr[i] == 2) {
                result[k] = i;
                k++;
            }
        }
        return result;
    }
}