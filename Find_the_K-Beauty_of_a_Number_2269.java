class Solution {
    public int divisorSubstrings(int num, int k) {
        String str = String.valueOf(num);
        int count = 0;
        for (int i = 0; i <= str.length() - k; i++) {
            String sub = str.substring(i, k + i);
            int sliding = Integer.valueOf(sub);
            if (sliding == 0) {
                continue;
            }
            if (num % sliding == 0) {
                count++;
            }
        }
        return count;

    }
}