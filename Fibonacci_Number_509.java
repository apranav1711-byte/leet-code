class Solution {
    public int fib(int n) {
        
        return fi(n);

    }
    private int fi(int k){
        if(k < 2){
            return k;
        }
        else{
            return fi(k-1) + fi(k-2);
        }
    }
}