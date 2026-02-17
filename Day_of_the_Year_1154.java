class Solution {
    public int dayOfYear(String date) {
        // just adding
        int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        int year = Integer.parseInt(date.substring(0, 4));
        int n = ((date.charAt(5) - '0') * 10 + (date.charAt(6) - '0')) - 1;
        int p = ((date.charAt(8) - '0') * 10 + (date.charAt(9) - '0'));

        for (int i = 0; i < n; i++) {
            p = p + months[i];
        }

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            if (n >= 2) {
                p += 1;
            }
        }

        return p;

    }
}