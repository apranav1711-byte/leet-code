class Solution {
    public int[] numberGame(int[] nums) {
        int n = nums.length;
        int[] look = new int[101];
        for (int i = 0; i < n; i++) {
            look[nums[i]]++;
        }
        int[] arr = new int[n];
        boolean hehe = true;
        int k = 1;
        int p = 0;
        for (int i = 0; i < look.length; i++) {
            if (look[i] != 0) {
                if (hehe) {
                    arr[k] = i;
                    look[i]--;
                    k += 2;
                    hehe = false;
                } else {
                    arr[p] = i;
                    look[i]--;
                    p += 2;
                    hehe = true;
                }
                if (look[i] != 0) {
                    i--;
                }
            }
        }
        return arr;
    }
}