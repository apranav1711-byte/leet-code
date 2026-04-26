class Solution {
    public int maxProduct(int n) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        int temp = n;
        while (temp > 0) {
            int rem = temp % 10;
            maxHeap.add(rem);
            temp /= 10;
        }

        if (maxHeap.size() < 2) {
            return 0; 
        }
        int a = maxHeap.poll(); 
        int b = maxHeap.poll();
        
        return a * b;
    }
}