class Solution {
    public int countOdds(int low, int high) {
        int k = (high - low) / 2;
        if (high % 2 == 1 || low % 2 == 1) {
            return k + 1;
        }
        return k;

    }
}