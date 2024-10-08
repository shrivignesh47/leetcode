class Solution {
    public boolean isPalindrome(int x) {

        int a=x;
        int m;
        int n=0;
        while(x>0)
        {
            m=x%10;
            n=m+n*10;
            x=x/10;
        }
        if(a==n)
        {
            return true;
        }
        return false;
    }
}