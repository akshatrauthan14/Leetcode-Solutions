class Solution {
    public int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int ans = 0;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                stack.push(ch);
            } else{
                //check for consecutive brackets
                //check if i doesn't go outside string and check adjacent elemetn too
                if(i+1<s.length() && s.charAt(i+1)==')'){
                    //consecutive ) found, skip this index
                    i++;
                } else{
                    //no consecutive ) found, insertion is req
                    ans++;
                }

                if(!stack.isEmpty()){
                    //it has ( hence pop it out
                    stack.pop();
                }
                else{
                    // if stack is empty and we have consecutive pair, insertion is req
                    ans++; 
                }
            }
        }
        return ans+2*stack.size();
    }
}
