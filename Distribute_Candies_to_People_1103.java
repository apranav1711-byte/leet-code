class Solution {
    public int[] distributeCandies(int candies, int num_people) {

        int[] result = new int[num_people];
        int give = 1;
        int i = 0;

        while (candies > 0) {

            int idx = i % num_people;

            int actualGive = Math.min(give, candies);
            result[idx] += actualGive;

            candies -= actualGive;
            give++;
            i++;
        }

        return result;
    }
}