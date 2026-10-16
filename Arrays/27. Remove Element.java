class Solution {
    public int removeElement(int[] nums, int val) {
        //remove element by int i = 0 and compare it with loop, then at last return i
        int i =0;
        for(int j =0; j<nums.length; j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
