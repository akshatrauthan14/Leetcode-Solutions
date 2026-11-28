class Solution {
    public int pivotIndex(int[] nums) {
        //find left and right sum
        //for right sum = total - left - arr[i]
        int tot = 0;
        for(int x: nums){
            tot += x;
        } 
        int left = 0;
        for(int i = 0; i<nums.length; i++){
            int right = tot - left - nums[i];
            if(right == left){
                return i;
            }
            left += nums[i];
        }
        return -1;
    }
}
