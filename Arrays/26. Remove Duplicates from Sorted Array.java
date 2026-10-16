class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        //shift each unique number to left of arr using 2 pointers
        int i = 1;
        for(int j = 1; j< nums.length; j++){
            if(nums[j] != nums[i-1]){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
