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
//app 2 - same but without stack
class Solution {
    public String removeOuterParentheses(String s) {
        //Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();
        int c = 0;
        for(char ch: s.toCharArray()){
            if(ch == '('){
                //for every outer bracket, count is always 0
                if(c>0){
                    ans.append(ch);
                }
                c++;
            } else{
                c--;
                if(c>0){
                    ans.append(ch);
                }
            }
        }
        return ans.toString();
    }
}
