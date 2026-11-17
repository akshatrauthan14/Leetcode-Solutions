class Solution {
    public boolean isIsomorphic(String s, String t) {
        //make 2 hashmaps stroing each char and its freq
        HashMap<Character, Integer> charIndexS = new HashMap<>();
        HashMap<Character, Integer> charIndexT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            // add new chars as key in map
            if (!charIndexS.containsKey(s.charAt(i))) {
                charIndexS.put(s.charAt(i), i);
            }

            if (!charIndexT.containsKey(t.charAt(i))) {
                charIndexT.put(t.charAt(i), i);
            }
            // if both the indexes don't match means that the char don't match
            if (!charIndexS.get(s.charAt(i)).equals(charIndexT.get(t.charAt(i)))) {
                return false;
            }
        }

        return true;
    }
}
