class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> num_count = new HashMap<>();
        int degree = 0;
        Map<Integer, Integer> first_seen = new HashMap<>();
        int minlen = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            first_seen.putIfAbsent(nums[i], i);
            num_count.put(nums[i], num_count.getOrDefault(nums[i], 0) + 1);

            if (num_count.get(nums[i]) > degree) {
                degree = num_count.get(nums[i]);
                minlen = i - first_seen.get(nums[i]) + 1;
            } else if (num_count.get(nums[i]) == degree) {
                minlen = Math.min(minlen, i - first_seen.get(nums[i]) + 1);
            }
        }
        return minlen;
    }
}
