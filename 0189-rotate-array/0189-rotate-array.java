// class Solution {
//     public void rotate(int[] nums, int k) {
//         int length = nums.length;
//         int[] temp = new int[length];

//         for (int i = 0; i < length; i++) {
//             temp[i] = nums[i];
//         }
//         for (int i = 0; i < length; i++) {
//             nums[(i + k) % length] = temp[i];
//         }
//     }
// }


class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
       reverse(0,n-1,nums);
       reverse(0,k-1,nums);
       reverse(k,n-1,nums); 
    }
    void reverse(int start,int end,int nums[]){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}