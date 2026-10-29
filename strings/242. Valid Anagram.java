//app-1
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> counter = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            counter.put(ch, counter.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (!counter.containsKey(ch) || counter.get(ch) == 0) {
                return false;
            }
            counter.put(ch, counter.get(ch) - 1);
        }

        return true;        
    }
}

//app2
class Solution {
    public boolean isAnagram(String s, String t) {
        //use arr of size 26 as str has only lowwrcase letters, traverse both strings together, if val = 0 for every letter then ret true
        if(s.length() != t.length()){
            return false;
        }
        int[] count = new int[26];
        for(int i = 0; i<s.length(); i++){
            //increase freq count of string s
            count[s.charAt(i) - 'a']++;
            //dec freq count of str t
            count[t.charAt(i) - 'a']--;
        }
        for(int num: count){
            if(num!=0){
                return false;
            }
        }
        return true;
    }
}

//app3
import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        
        return Arrays.equals(sArray, tArray); // This works because they are now char arrays, not Strings!
    }
}
