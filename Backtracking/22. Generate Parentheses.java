class Solution {
    public void solve(int open, int close, StringBuilder curr, List<String> ans){
        //base case
        if(open == 0 && close == 0){
            ans.add(curr.toString());
            return;
        }
        // if open brackets more than closing brackets
        if(open>0){
            curr.append('(');
            //recursive call
            solve(open-1,close,curr,ans);
            //backtracking call
            curr.deleteCharAt(curr.length()-1);
        }
        // if close brackets are more
        if(close>open){
            curr.append(')');
            solve(open,close-1,curr,ans);
            curr.deleteCharAt(curr.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        //keep track of open and close bracket 
        List<String> ans = new ArrayList<>();
        StringBuilder curr = new StringBuilder();
        solve(n,n,curr,ans);
        return ans;
    }
}
