class Solution {
    public int findClosest(int x, int y, int z) {
        int k1 = Math.abs(z - x);
        int k2 = Math.abs(z - y);
        if(k1 > k2){
            return 2;
        }
        else if(k1 == k2){
            return 0;
        }
        else{
            return 1;
        }


    }
}