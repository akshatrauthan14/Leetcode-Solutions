class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        //product of everything to the left
        int left = 1;
        for(int i = 0; i<nums.length; i++){
            ans[i] = left;
            left = left*nums[i];
        }
        //product of everything to the right
        int right = 1;
        for(int i = nums.length-1; i>=0; i--){
            ans[i] *= right;
            right = right*nums[i];
        }
        return ans;
    }
}
