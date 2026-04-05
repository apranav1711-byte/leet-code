class Solution {
    public int mirrorDistance(int n) {

        return Math.abs(n - reverse(n));
        
    }
    private int reverse(int k){
        int reverse = 0;
        while(k > 0){
            int temp = k%10;
            reverse = reverse*10 + temp;
            k/=10;
        }
        return reverse;
    }
}