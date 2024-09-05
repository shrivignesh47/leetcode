class Solution {
    public int hammingWeight(int n) {

        int count=0;
        while(n!=0){

            // Note this operation removes "ONE" set bit (the least most significant) from the give number
            // so repeating this operation will eventually lead to n=0 and return the count
            n=n&(n-1);
            count++;
        }
        return count;
    }
}