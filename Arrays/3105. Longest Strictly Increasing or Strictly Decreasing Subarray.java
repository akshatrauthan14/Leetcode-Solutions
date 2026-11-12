class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int count = 1;
        int asc = 1;
        int desc = 1;
        for(int i = 1; i< nums.length; i++){
            asc = nums[i-1] < nums[i] ? asc + 1: 1; //inc part
            desc = nums[i-1] > nums[i] ? desc +1 : 1; // dec part
            count = Math.max(count, Math.max(asc,desc));
        }
        return count;
    }
}
