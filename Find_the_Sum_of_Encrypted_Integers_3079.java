class Solution {
    public int sumOfEncryptedInt(int[] nums) {

        int result = 0;
        for(int i = 0; i < nums.length ; i++){
            result += encrypt(nums[i]);
        }
        return result ;
    }
    private int encrypt(int k){
        int max = 0;
        int p = k;
        int count = 0;
        while(p > 0){
            int rem = p%10;
            max = Math.max(rem , max);
            count++;
            p/=10;
        }
        int s = (int)(0.1111 *  max * Math.pow(10 , count));
        return s;
    }
}