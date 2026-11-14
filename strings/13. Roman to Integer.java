class Solution {
    private int getVal(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
    public int romanToInt(String s) {
        int res = 0;
        //create map for chars but make switch case as its faster
        // 4 and 9 are rep by 2 chars not by 1 so convert either one or 2 chars at a time
        for(int i = 0; i<s.length(); i++){
            // if curr val < next value then subtract it
            if(i<s.length()-1 && getVal(s.charAt(i)) < getVal(s.charAt(i+1))){
                res -= getVal(s.charAt(i));
            } else {
                res += getVal(s.charAt(i));
            }
        }
        return res;
    }
}
