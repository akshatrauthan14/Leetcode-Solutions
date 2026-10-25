class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums,0,ans);
        return ans;
    }
    public void helper(int[] nums, int i, List<List<Integer>> ans){
        //base case
        if(i == nums.length){
            List<Integer> res = new ArrayList<>();
            for(int num:nums){
                res.add(num);
            }
            ans.add(res);
            return;
        }
        for(int j = i; j<nums.length; j++){
            swap(nums,i,j);
            helper(nums,i+1,ans);
            //backtrack
            swap(nums,i,j);
        }
    }
    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    
}
