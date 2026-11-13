class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        sum(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }
    private void sum(int[] candidates, int target, int start, List<Integer> comb, List<List<Integer>> res){
        //curr comb cannot lead to valid sum
        if(target < 0){
            return;
        }
        //base case
        if(target == 0){
            res.add(new ArrayList<Integer>(comb));
            return;
        }
        // iterate thru arr from start for all nums to be included in curr comb
        for(int i = start; i < candidates.length; i++){
            //skip duplicates to avoid dup generations
            if(i > start && candidates[i] == candidates[i-1]){
                continue;
            }
            if(candidates[i] > target){
                break;
            }
            comb.add(candidates[i]);
            //rec call
            sum(candidates, target - candidates[i], i+1, comb, res);
            //backtrack
            comb.remove(comb.size()-1);
        }
    }
}
