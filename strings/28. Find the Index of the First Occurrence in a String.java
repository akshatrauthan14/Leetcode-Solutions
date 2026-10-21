class Solution {
    public int strStr(String haystack, String needle) {
        //make a sliding window of the len of needle and move it forwards if we dont find the substring
        for(int i = 0; i<= haystack.length() - needle.length(); i++){
            int j = 0;
            //compare letters of both strings
            while(j<needle.length() && haystack.charAt(i+j) == needle.charAt(j)){
                //increase size of the window
                j++;
            }
            if(j == needle.length()){
                return i;
            }
        }
        return -1;
    }
}
//app2
class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
