class Solution {
    public int[] decimalRepresentation(int n) {
        
        List<Integer> list = new ArrayList<>();
        
        int place = 1;
        
        while (place * 10 <= n) {
            place *= 10;
        }
        
        while (n > 0) {
            int digit = n / place;
            
            if (digit != 0) {
                list.add(digit * place);
            }
            
            n %= place;
            place /= 10;
        }
        
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
}