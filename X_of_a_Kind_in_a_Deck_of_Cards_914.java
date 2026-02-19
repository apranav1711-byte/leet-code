
import java.util.*;

class X_of_a_Kind_in_a_Deck_of_Cards_914 {
    public boolean hasGroupsSizeX(int[] deck) {
        // just adding thisl
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int card : deck) {
            map.put(card, map.getOrDefault(card, 0) + 1);
        }

        int gcd = 0;

        for (int freq : map.values()) {
            gcd = findGCD(gcd, freq);
        }

        if (gcd > 1) {
            return true;
        } else {
            return false;
        }

    }

    private int findGCD(int a, int b) {
        if (a == 0)
            return b;
        return findGCD(b % a, a);
    }

}