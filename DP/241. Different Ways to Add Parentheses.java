class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        //for each operator, split string into left and right expn and recursively compute both their results
        //then combine both operators based on curr operator 
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i<expression.length(); ++i){
            char oper = expression.charAt(i);
            if(oper == '+' || oper == '-' || oper == '*'){
                //split into 2 parts 
                List<Integer> left = diffWaysToCompute(expression.substring(0,i));
                List<Integer> right = diffWaysToCompute(expression.substring(i+1));
                //solve for parts
                for(int a: left){
                    for(int b: right){
                        if(oper == '+'){
                            ans.add(a+b);
                        } else if(oper == '-'){
                            ans.add(a-b);
                        } else if(oper == '*'){
                            ans.add(a*b);
                        }
                    }
                }
            }
        }
        if(ans.isEmpty()){
            ans.add(Integer.parseInt(expression));
        }
        return ans;
    }
}
