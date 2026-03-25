class Solution {
    public int concatenateAndMultiply(int n) {
        if (n == 0)
            return 0;

        int divisor = 1;
        while (n / divisor >= 10) {
            divisor *= 10;
        }

        int x = 0;
        int sum = 0;

        while (divisor > 0) {
            int digit = n / divisor;

            if (digit != 0) {
                x = x * 10 + digit;
                sum += digit;
            }

            n = n % divisor;
            divisor /= 10;
        }

        return x * sum;
    }
}