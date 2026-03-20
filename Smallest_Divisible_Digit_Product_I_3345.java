class Solution {
    public int smallestNumber(int n, int t) {
        for (int i = n; i <= n + 10; i++) {

            int k = 1;
            int temp = i;
            while (temp > 0) {
                int rem = temp % 10;
                temp /= 10;
                k = k * rem;
            }
            if (k % t == 0) {
                return i;
            }

        }
        return 0;
    }
}