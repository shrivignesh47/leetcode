class Solution {
    public int singleNumber(int[] nums)
    {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]==nums[i])
                    count++;
                arr[i]=count;
            }
        }
        
    int out=0;
     for(int i=0;i<arr.length;i++)
     {
        if(arr[i]==1)
            out=nums[i];
     }
        return out;
    }
}