class Solution {
    public boolean isPerfectSquare(int n) {
        int s = 0;
        int e =  n;
       
        while (s<=e) {
            int m = s+(e-s)/2;
            long sq = (long)m*m; // imp to typecast
            if (sq == n){
                return true;
            }
            if (sq>n) {
                e = m-1;
            }
            else{
                s= m+1;
            }
        }
        
        return false;
    }
}
