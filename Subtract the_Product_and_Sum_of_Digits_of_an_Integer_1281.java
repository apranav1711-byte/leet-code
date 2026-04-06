class Solution {
    public int subtractProductAndSum(int n) {
        int add = 0;
        int product = 1;
        int temp = n;
        while (temp > 0) {
            int rem = temp % 10;
            add += rem;
            product *= rem;
            temp /= 10;
        }
        return product - add;

    }
}