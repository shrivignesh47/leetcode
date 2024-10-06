class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
                int[] temp = new int[length];

                        // Copy elements to the temporary array
                            for (int i = 0; i < length; i++) {
                                            temp[i] = nums[i];
                                }

                                                            // Perform rotation
            for (int i= 0; i < length; i++) {
                                                                                nums[(i + k)%length]= temp[i];
                                                                                        }
    }
}