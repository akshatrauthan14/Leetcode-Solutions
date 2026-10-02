class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0;
        for(int i = 0; i<nums.length; i++){
            //if number gets stuck
            if(i>maxReach){
                return false;
            }
            //find farthest possible index we can go from current index
            maxReach = Math.max(maxReach, i + nums[i]);
            //check if last index is reachable or not?
            if(maxReach>=nums.length-1){
                return true;
            }
        }
        return true;
    }
}
