class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int first = nums[n - 2];
        int second = nums[n - 1];
        int max = (first - 1) * (second - 1);
        if(max > 0) {
            return max;
        } 
        return 0;
    }
}