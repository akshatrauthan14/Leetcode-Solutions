class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                //add this only if ( is not outermost bracket
                if(!stack.isEmpty()){
                    ans.append(ch);
                }
                //if it is outermost bracket then addd in stack
                stack.push(ch);
            } else{
                stack.pop();
                //if ) is not outermost bracket then add to ans
                if(!stack.isEmpty()){
                    ans.append(ch);
                }
            }
        }
        return ans.toString();
    }
}
