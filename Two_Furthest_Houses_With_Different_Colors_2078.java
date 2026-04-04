class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;

        for (int i = n - 1; i >= 0; i--) {
            if (colors[i] != colors[0])
                return i;
            if (colors[n - 1 - i] != colors[n - 1])
                return i;
        }

        return 0;
    }
}