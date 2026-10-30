class Solution {
    public int expand(String s, int l, int r){
        while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
    public String longestPalindrome(String s) {
        //start 2 pointers from s[0] and expand around center for either odd or even length palindrome
        if(s == null || s.length() == 0){
            return "";
        }
        int start = 0;
        int end = 0;
        for(int i = 0; i<s.length(); i++){
            int odd = expand(s,i,i);
            int even = expand(s,i,i+1);
            int maxLen = Math.max(odd,even);
            if(maxLen > end-start){
                start = i - (maxLen-1)/2;
                end = i + maxLen/2;
            }
        }
        return s.substring(start,end+1);
    }
}
