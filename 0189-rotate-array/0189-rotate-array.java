class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int[] temp = new int[length];

        for (int i = 0; i < length; i++) {
            temp[i] = nums[i];
        }
        for (int i = 0; i < length; i++) {
            nums[(i + k) % length] = temp[i];
        }
    }
}