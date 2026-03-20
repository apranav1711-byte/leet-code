class Solution {
    public long[] sumOfThree(long num) {

        num = (num + 3);

        if (num % 3 != 0) {
            return new long[] {};
        } else {
            num = num / 3;
            return new long[] { num - 2, num - 1, num };
        }

    }
}