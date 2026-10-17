class Solution {
    public boolean isP(int st, int e, String s){
        while(st<e){
            if(s.charAt(st)!= s.charAt(e)){
                return false;
            }
            // if both are equal. move pointers
            st++;
            e--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        //use 2 pointers and check last 2 char
        int st = 0;
        int e = s.length() - 1;
        while(st<e){
            if(s.charAt(st) == s.charAt(e)){
                //move both pointers inwards
                st++;
                e--;
            } else{
                // check if string becomes palindrome if we either delete left char or right car
                return isP(st+1,e,s) || isP(st,e-1,s);
            }
        }
        return true;
    }
}
