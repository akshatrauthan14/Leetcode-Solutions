class Solution {
    public int longestConsecutive(int[] nums) {
        //make set for min tc for checking elements, then check if n-1 is in set or not
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int longest = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                //reset subseq length and keep track of subseq starting from n
                int l = 1;
                while(set.contains(num+l)){
                    l++;
                }
                longest = Math.max(longest , l);
            }

        }
        return longest;
    }
}
