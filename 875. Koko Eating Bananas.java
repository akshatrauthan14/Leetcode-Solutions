class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int s = 1;
        int e=0;
        for(int x:piles){
            e = Math.max(e,x); 
        }
        while (s<=e){
            int k = s+(e-s)/2;
            double hours = 0;
            for(int i:piles){
                //hours += Math.ceil((double)i/k);
                hours += (i+k-1)/k; 
            }
            if(hours<=h){
                e=k-1;
            }
            else{
                s=k+1;
            }
        }
        return s;
    }
}
