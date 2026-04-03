class Solution {
    public String maximumNumber(String num, int[] change) {

        char[] arr = num.toCharArray();
        boolean started = false;

        for (int i = 0; i < arr.length; i++) {
            int k = arr[i] - '0';
            int s = change[k];

            if (s > k) {
                arr[i] = (char) (s + '0');
                started = true;
            } else if (s == k && started) {
                arr[i] = (char) (s + '0');
            } else if (started) {
                break;
            }
        }

        return new String(arr);
    }
}