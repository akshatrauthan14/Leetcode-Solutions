class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        //for every num arr[i], check if arr[num-1] is -ve. if yes then its dup
        //if no then mark it as -ve
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int x = Math.abs(nums[i]);
            if(nums[x-1]<0){
                ans.add(x);
            }
            nums[x-1] *= -1;
        }
        return ans;
    }
}
