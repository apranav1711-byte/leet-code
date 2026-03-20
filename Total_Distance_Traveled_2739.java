class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {

        int result = 0;

        while (mainTank >= 0 && additionalTank >= 0) {
            if (mainTank >= 5 && additionalTank > 0) {
                mainTank = mainTank - 5;
                result += 5;
                mainTank++;
                additionalTank--;
            } else {
                result += mainTank;
                break;
            }
        }
        return result * 10;

    }
}