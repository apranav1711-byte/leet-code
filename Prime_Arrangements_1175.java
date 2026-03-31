class Solution {
    long MOD = 1000000007L;

    public int numPrimeArrangements(int n) {
        int prime = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                prime++;
            }
        }

        int nonPrime = n - prime;

        long ans = (factorial(prime) * factorial(nonPrime)) % MOD;
        return (int) ans;
    }

    private boolean isPrime(int k) {
        if (k < 2)
            return false;

        for (int i = 2; i * i <= k; i++) {
            if (k % i == 0)
                return false;
        }
        return true;
    }

    private long factorial(int l) {
        long fact = 1;
        for (int i = 1; i <= l; i++) {
            fact = (fact * i) % MOD;
        }
        return fact;
    }
}