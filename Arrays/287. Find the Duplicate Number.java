class Solution {
    public int findDuplicate(int[] nums) {
        //n+1 ints in arr of len n means atleast 1 is repeated
       int len = nums.length;
       int low = 1;
       int high = len - 1;
       while(low<high){
            int mid = low+(high-low)/2;
            int count = 0;
            for(int i = 0; i<len; i++){
                if(nums[i] <= mid){
                    count++;
                }
            }
            if(count<=mid){
                low = mid+1;
            } else {
                high = mid;
            }
        }
        return low; 
    }
}

//app 2
class Solution {
    public int findDuplicate(int[] nums) {
        // treat it like a ll and use slow and fast pointer and find the first element that reoccurs, similar to the problem 
        int slow = 0;
        int fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        
        return slow;
    }
}
