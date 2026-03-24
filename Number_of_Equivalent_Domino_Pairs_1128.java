import java.util.*;

class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<String, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < dominoes.length; i++) {
            int a = dominoes[i][0];
            int b = dominoes[i][1];

            int min = Math.min(a, b);
            int max = Math.max(a, b);

            String key = min + "," + max;

            int freq = map.getOrDefault(key, 0);
            count += freq;
            map.put(key, freq + 1);
        }

        return count;
    }
}