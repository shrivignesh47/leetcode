class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                  list.add(nums1[i]);
                  nums2[j]=-1;
                  break;
                }
            }
        }
        int []res=new int [list.size()];
        int index=0;
        for(int a:list){
          res[index++]=a;
        }
        return res;
    }
}