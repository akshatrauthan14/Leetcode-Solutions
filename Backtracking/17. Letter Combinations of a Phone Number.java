class Solution {
    static void solve(String digits, int in, String[] mapping, List<String> ans, StringBuilder output){
        //base case
        if(in>=digits.length()){
            ans.add(output.toString());
            return;
        }
        //solving 1 case
        int val = digits.charAt(in) - '0'; // to typecast into int
        String mappedString = mapping[val];
        for(int i = 0; i<mappedString.length(); i++){
            output.append(mappedString.charAt(i));
            //recursive call
            solve(digits,in+1,mapping, ans, output);
            //backtracking
            output.deleteCharAt(output.length()-1);
        }

    }
    public List<String> letterCombinations(String digits) {
        int i = 0;
        String[] mapping = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        ArrayList<String> ans = new ArrayList<>();
        StringBuilder output = new StringBuilder();
        solve(digits,i,mapping,ans,output);
        return ans;
    }
}
