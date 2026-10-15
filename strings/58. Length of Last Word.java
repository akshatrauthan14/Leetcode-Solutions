class Solution {
    public int lengthOfLastWord(String s) {
        //start from end of string, skip spaces and calc length
        int n = s.length()-1;
        //skip if spaces are at last
        while(n>=0 && s.charAt(n) == ' '){
            n--;
        }
        //now we are at last letter of string
        int l = 0;
        while(n>=0 && s.charAt(n) != ' '){
            l++;
            n--;
        }
        return l;
    }
}
