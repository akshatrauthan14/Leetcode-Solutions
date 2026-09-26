class Solution {
    public int majorityElement(int[] nums) {
        // also works
        //Arrays.sort(nums);
        //return nums[nums.length/2];

        //booyer moore O(n)
        int c = 0;
        int candidate = 0;
        for(int num: nums){
            if(c==0){
                candidate = num;
            }
            if(num == candidate){
                c++;
            } else{
                c--;
            }
        }
        return candidate;
    }
}
