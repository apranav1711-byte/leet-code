class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int k = purchaseAmount % 10 + purchaseAmount;
        int p = k - k % 10;
        return 100 - p;

    }
}