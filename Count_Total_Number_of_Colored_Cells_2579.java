class Solution {
    public long coloredCells(int n) {

        long result = 1 + 2L * n * (n - 1);

        return result;

    }
}