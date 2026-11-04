class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 2){
            return nums.length;
        }
        //initialize var for length 
        int k = 2;
        //start loop from 2nd index as first 2 are always valid
        for(int i = 2; i<nums.length; i++){
            if(nums[i] != nums[k-2]){
                //in place update the array
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
