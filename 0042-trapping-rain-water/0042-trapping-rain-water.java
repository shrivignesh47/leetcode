class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int l=0,r=n-1;
        int lhb=height[0];
        int rhb=height[n-1];
        int res=0;
        if(n<=2){
            return 0;
        }
        while(l<=r){
            if(lhb<=rhb){
                if(height[l]>=lhb){
                    lhb=height[l];
                }
                else{
                    res+=(lhb-height[l]);
                }
                l++;
            }
            else{
                if(height[r]>=rhb){
                    rhb=height[r];
                }
                else{
                    res+=(rhb-height[r]);
                }
                r--;
            }
        }
        return res;
    }
}