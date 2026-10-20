class Solution {
    public int lengthOfLongestSubstring(String s) {
        // make a sliding window and increase it. add eveery letter to a set and compare it. if not in set then remove it
        int left = 0;
        int len = 0;
        HashSet<Character> set = new HashSet<>();
        //move the window towards right
        for(int right = 0; right<s.length(); right++){
            while(set.contains(s.charAt(right))){
                //move window forward
                set.remove(s.charAt(left));
                left++;
            }
            //to move window right
            set.add(s.charAt(right));
            len = Math.max(len,right-left+1);
        }
        return len;
    }
}
