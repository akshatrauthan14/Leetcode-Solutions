class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // app1- sort and teaverse the arr O(nlogn)
        //app 2 - don't sort, count elements < and = target and return the range of [less, less+equal-1]
        int less = 0;
        int equal = 0;
        for(int num:nums){
            if(num < target){
                less++;
            } else if (num == target){
                equal++;
            }
        }
        //now we have count of elements < and = target
        List<Integer> ans = new ArrayList<>();
        for(int i = less; i<= less+equal-1; i++){
            ans.add(i);
        }
        return ans;
    }
}
