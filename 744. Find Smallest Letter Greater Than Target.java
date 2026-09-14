class Solution {
    public char nextGreatestLetter(char[] arr, char target) {
        int s = 0;
        int e = arr.length-1;
        while (s<=e) {
            int m = s+(e-s)/2;
            
            if (target>=arr[m]) {
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        return arr[s%arr.length];
    }
}
