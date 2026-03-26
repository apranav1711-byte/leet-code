public class Three_Divisors_1952 {

}

class Solution {
    public boolean isThree(int n) {

        int c = (int) Math.sqrt(n);

        if (c * c != n)
            return false;

        return isPrime(c);
    }

    private boolean isPrime(int num) {
        if (num < 2)
            return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}