class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        sum(candidates, target, 0, new ArrayList<>(), 0, res);
        return res;
    }
    private void sum(int[] candidates, int target, int index, List<Integer> comb, int tot, List<List<Integer>> res){
        //base case
        if(tot == target){
            res.add(new ArrayList<>(comb));
            return;
        }
        if(tot > target || index >= candidates.length){
            return;
        }
        comb.add(candidates[index]);
        //rec call
        sum(candidates, target, index, comb, tot + candidates[index], res);
        //backtrack
        comb.remove(comb.size()-1);
        //rec call again
        sum(candidates, target, index+1, comb, tot, res);
    }
}
