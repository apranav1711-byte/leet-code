import java.util.*;

class Solution {
    public int largestInteger(int num) {

        PriorityQueue<Integer> evenHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> oddHeap = new PriorityQueue<>(Collections.reverseOrder());

        int temp = num;
        while (temp > 0) {
            int d = temp % 10;
            if (d % 2 == 0) {
                evenHeap.offer(d);
            } else {
                oddHeap.offer(d);
            }
            temp /= 10;
        }

        int result = 0;
        char[] digits = String.valueOf(num).toCharArray();

        for (char c : digits) {
            int d = c - '0';
            result *= 10;

            if (d % 2 == 0) {
                result += evenHeap.poll(); 
            } else {
                result += oddHeap.poll();   
            }
        }

        return result;
    }
} Largest_Number_After_Digit_Swaps_by_Parity_2231 {
    
}
