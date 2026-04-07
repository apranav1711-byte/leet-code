import java.util.*;

class Solution {
    public String kthDistinct(String[] arr, int k) {

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            String hehe = arr[i];
            int he = map.get(hehe);
            if (he == 1) {
                s++;
                if (s == k) {
                    return hehe;
                }
            }

        }
        return "";
    }
}