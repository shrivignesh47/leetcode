class Solution {
    public int pivotIndex(int[] nums) {
for(int i=0;i<nums.length;i++)
{
    int lsum=0;
    for(int j=0;j<i;j++)
    {
        lsum=lsum+nums[j];
    }
    int rsum=0;
    for(int j=i+1;j<nums.length;j++)
    { 
         rsum=rsum+nums[j];
    }
    if(lsum==rsum)
    {
        return i;
    }
}
        return -1;
    }
}