class Solution {
    public String removeDuplicates(String s) {
        char[] ans=s.toCharArray();
        int i=-1;
        for(char c : ans){
            if(i>=0 && ans[i]==c){
                i--;
            }
            else{
                i++;
                ans[i]=c;
            }
        }
        return String.valueOf(ans,0,i+1);
    }
}