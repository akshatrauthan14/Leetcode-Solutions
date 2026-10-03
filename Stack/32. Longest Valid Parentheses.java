class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // boundary chewck
        int ans = 0;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            }
            else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                } 
                else{
                    // we have our substring
                    int length = i - stack.peek();
                    ans = Math.max(ans,length);
                }
            }
        }
        return ans;
    }
}
