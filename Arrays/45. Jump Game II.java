class Solution {
    public int jump(int[] nums) {
        int near = 0;
        int far = 0;
        int jumps = 0; //no of jumps made
        while(far < nums.length - 1){
            //make var that stores farthest index we can reach from curr range [near,far]
            int farthest = 0;
            for(int i = near; i<=far; i++){
                // for every index in range, calc farthest we can reach i.e. i+nums[i] and update farthest
                farthest = Math.max(farthest, i+nums[i]);
            }
            //update near and far
            near = far + 1;
            far = farthest;
            jumps++;
        }
        return jumps;
    }
}
