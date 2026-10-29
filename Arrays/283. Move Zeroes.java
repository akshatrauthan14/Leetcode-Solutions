class Solution {
    public void moveZeroes(int[] nums) {
        //move all non 0 nos to left
        int l = 0;
        for(int r = 0; r<nums.length; r++){
            if(nums[r]!=0){
                //swap l and r
                int temp = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;
                l++;
            }
        }
    }
}
