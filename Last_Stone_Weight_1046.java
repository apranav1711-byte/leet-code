import java.util.*;

class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < stones.length; i++) {
            maxheap.add(stones[i]);
        }

        while (maxheap.size() > 1) {
            int first = maxheap.poll();
            int second = maxheap.poll();
            if (first == second) {
                continue;
            } else {
                maxheap.add(Math.abs(second - first));
            }
        }
        if (maxheap.isEmpty()) {
            return 0;
        } else {
            return maxheap.poll();
        }
    }
}