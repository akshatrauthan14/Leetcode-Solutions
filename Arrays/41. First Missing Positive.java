class Solution {
    public int firstMissingPositive(int[] nums) {
        //put all numbers in their coorect index
        for (int i = 0; i<nums.length; i++){
            
            while(nums[i]>=1 && nums[i]<=nums.length ){
                int correctIndex =nums[i]-1;
                if( nums[i] == nums[correctIndex]){
                    break;
                }
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
        }
        for(int i =0; i<nums.length; i++){
            if(nums[i] != i+1){
                return i+1;
            }
        }
        //if all are present
        return nums.length +1;
         
    }
}
