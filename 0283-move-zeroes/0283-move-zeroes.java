class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int c=0;
        int k=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[k++]=nums[i];
                // k++;
            }
            else c++;
        }
        for(int j=n-1;c>0;c--,j--){
            nums[j]=0;
        }
    }
}