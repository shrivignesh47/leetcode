class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> countOccurences = new HashMap<>();
        HashSet<Integer> isExist  = new HashSet<>();
        // store all the occurences in hashMap of every key
        for(int i = 0; i < arr.length; i++){
            countOccurences.put(arr[i],countOccurences.getOrDefault(arr[i],0)+1);
        }
        // check if any occurence is repeated twice using hashset
        for(int val:countOccurences.values()){
            if( ! isExist.contains(val)) isExist.add(val);
            else return false;
        }
        return true;
    }
}