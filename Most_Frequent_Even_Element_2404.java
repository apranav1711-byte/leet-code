class Solution {
    public int mostFrequentEven(int[] nums) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (num % 2 == 0) {
                if (freq.containsKey(num)) {
                    freq.put(num, freq.get(num) + 1);
                } else {
                    freq.put(num, 1);
                }
            }
        }
        int maxFreq = 0;
        int ans = -1;
        for (int key : freq.keySet()) {
            int count = freq.get(key);

            if (count > maxFreq) {
                maxFreq = count;
                ans = key;
            } else if (count == maxFreq && key < ans) {
                ans = key;
            }
        }

        return ans;
    }
}