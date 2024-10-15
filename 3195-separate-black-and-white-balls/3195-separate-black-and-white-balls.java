class Solution {
    public long minimumSteps(String s) {
        int n = s.length();
        char ch[] = s.toCharArray();
        long zeros = 0;
        long ans = 0;
        boolean flag = false;
        for(int i = n-1; i >= 0; i--) {
            if(ch[i] == '1' && flag == false) {
                continue;
            }
            else if(ch[i] == '0') {
                flag = true;
                zeros++;
            }
            else {
                ans += zeros;
            }
        }
        return ans;

    }
}