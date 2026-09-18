class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int i = s.length()-1;
        while(i>=0){
            //remove trailing spaces
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }
            //check value of i
            if(i<0){
                break;
            }
            int j = i;
            //find start index of word
            while(j>=0 && s.charAt(j)!=' '){
                j--;
            }
            ans.append(s.substring(j+1,i+1));
            //now j is at space so move j behind
            while(j>=0 && s.charAt(j)==' '){
                j--;
            }
            //add a space after each word except first word
            //first word is at j<0 index
            if(j>=0){
                ans.append(' ');
            }
            //place i at last index of rem string
            i=j;
        }
        return ans.toString();
    }
}
