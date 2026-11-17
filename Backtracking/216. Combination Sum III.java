class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(k,1,n,new ArrayList<>(), ans);
        return ans;
    }
    public static void solve(int k, int idx, int n, ArrayList<Integer> list, List<List<Integer>> ans){
        //if target is achieved and all k eelemtns have been used
        if(n == 0 && k==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = idx; i<10; i++){
            //edge cases
            if(i > n || k<=0){
                break;
            }
            list.add(i); //choose curr no
            //rec call
            solve(k-1, i+1, n-i, list, ans);
            //backtrack
            list.remove(list.size()-1);
        }
    }
}
