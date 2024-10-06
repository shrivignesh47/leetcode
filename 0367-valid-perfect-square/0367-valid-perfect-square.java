class Solution {
    public boolean isPerfectSquare(int num) {
        int q = num/4;
        int i = 1;
        while (i <= q + 1) {
            if (i * i == num) {
                return true;
            } else {
                i++;
            }
        }
        return false;
    }
}