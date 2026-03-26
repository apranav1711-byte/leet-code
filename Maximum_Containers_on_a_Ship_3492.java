class Solution {
    public int maxContainers(int n, int w, int maxWeight) {

        int k = n * n;
        int s = maxWeight / w;
        return Math.min(k, s);
    }
}