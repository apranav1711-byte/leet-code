class Solution {
    public int alternateDigitSum(int n) {

        int length = (int) Math.log10(n) + 1;
        int result = 0;

        while (n > 0) {
            int k = n % 10;
            n = n / 10;
            if (length % 2 == 0) {
                result -= k;
            } else {
                result += k;
            }
            length--;
        }
        return result;
    }
}