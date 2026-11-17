class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        //either choose the last house or not and return the max profit from both 
        return Math.max(getMax(nums, 0, nums.length - 2), getMax(nums, 1, nums.length - 1));        
    }

    private int getMax(int[] nums, int start, int end) {
        int prevRob = 0; //max amt till prev house
        int maxRob = 0; //max amt till curr house

        for (int i = start; i <= end; i++) {
            int temp = Math.max(maxRob, prevRob + nums[i]); // max of not robbing curr house and robbing curr house
            //update the vars
            prevRob = maxRob;
            maxRob = temp;
        }

        return maxRob;
    }    
}
