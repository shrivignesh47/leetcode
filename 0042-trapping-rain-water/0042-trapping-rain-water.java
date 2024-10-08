class Solution {
    public int trap(int[] height) {
    int ans=0;
    int l=0;
    int lmax= -20;
    int rmax= -20;
    int r = height.length-1;
    while(l<r){
        lmax=Math.max(lmax,height[l]);
        rmax=Math.max(rmax,height[r]);
        ans+=lmax<rmax?lmax-height[l++]:rmax-height[r--];
    }
    return ans;
    }
}