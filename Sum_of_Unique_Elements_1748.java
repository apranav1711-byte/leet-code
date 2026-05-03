class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer , Integer > hehe = new HashMap<>();
        for(int i = 0; i< nums.length ; i++){
            hehe.put(nums[i], hehe.getOrDefault(nums[i], 0) + 1);
        }
        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : hehe.entrySet()) {
            if (entry.getValue() == 1) {
                sum += entry.getKey();
            }
        }

        return sum;  
    }
}