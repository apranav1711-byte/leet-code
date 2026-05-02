class Solution {
    public long sumAndMultiply(int n) {
        long x = 0;
        long multiplier = 1;

        while (n > 0) {
            int rem = n % 10;

            if (rem != 0) {
                x = rem * multiplier + x;
                multiplier *= 10;
            }

            n /= 10;
        }

        long sum = 0, temp = x;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        return x * sum;
    }
}