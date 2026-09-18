class Solution {
    static boolean compareFreq(int[] c1, int[] c2){
        for(int i = 0; i<26;i++){
            if(c1[i]!=c2[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
       //edge case
       if(s1.length() > s2.length()){
        return false;
       } 
       //make table of s1
       int[] c1 = new int[26];
       for(int i = 0; i<s1.length(); i++){
        char ch = s1.charAt(i);
        int index = ch-'a';
        c1[index]++;
       }
       //process window of s2
       int i = 0;
       int windowLength = s1.length();
       int[] c2 = new int[26];
       for(i = 0; i<windowLength; i++){
        char ch = s2.charAt(i);
        int index = ch-'a';
        c2[index]++;
       }
       if(compareFreq(c1,c2) == true){
        return true;
       }
       else{
        //both freq tables not matching
        //process remaining windows
        while(i<s2.length()){
            //move to new window
            //add new char to window
            char newChar = s2.charAt(i);
            int newCharIndex = newChar-'a';
            c2[newCharIndex]++;
            //remove old char from window
            int oldCharIndex = i - windowLength;
            char oldChar = s2.charAt(oldCharIndex);
            c2[oldChar-'a']--;
            if(compareFreq(c1,c2) == true){
                return true;
            }
            i++;
        }
       }
        return false;    
    }
}
