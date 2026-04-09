import java.util.*;

class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < nums.length; i++) {
            maxheap.add(nums[i]);
        }
        int first = maxheap.poll();
        int second = maxheap.poll();

        return (first - 1) * (second - 1);

    }
}