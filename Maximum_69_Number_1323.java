class Solution {
    public int maximum69Number(int num) {
        if (num == 9999) {
            return 9999;
        }
        int k = (int) (Math.log10(num));
        int s = (int) Math.pow(10, k);
        int temp = num;
        while (s > 0) {
            int p = temp / s;
            if (p == 6) {
                num = num + (3 * s);
                return num;
            }
            temp = temp % s;
            s /= 10;

        }
        return num;
    }
}