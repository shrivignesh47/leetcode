class Solution {
    public int reverse(int x) {
        long result = 0;
        long MaximumValue=Integer.MAX_VALUE;
        long MinimumValue=Integer.MIN_VALUE;
        while (x != 0) {
            int digit = x % 10; 
             result =result* 10 + digit; 
            x /= 10; 
        } 
            if (result > MaximumValue || result < MinimumValue) {
            return 0; 
        }

        return (int) result;
    }
}
 