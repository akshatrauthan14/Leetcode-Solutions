class Solution {
    //rec soln
    // public int rob(int[] nums) {
    //     return rob(nums,nums.length-1);
    // }
    // public int rob(int[] arr, int i){
    //     if(i<0){
    //         return 0;
    //     }
    //     int include = arr[i] + rob(arr,i-2);
    //     int exclude = 0 + rob(arr,i-1);
    //     return Math.max(include,exclude);
    // }
    // dp soln conversion
    public int rob(int[] nums){
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        int[] ans = new int[n];
        ans[0] = nums[0];
        ans[1] = Math.max(nums[0], nums[1]);
        for(int i = 2; i<n; i++){
            ans[i] = Math.max(ans[i-1], nums[i] + ans[i-2]);
        }
        return ans[n-1];
    }
}
