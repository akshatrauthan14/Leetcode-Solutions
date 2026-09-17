class Solution {
    public int reachNumber(int target) {
        if(target<0){
            target = (-1)*target;
        }
       int sum = 0;
       int moves = 0;
       while(sum<target || (sum-target)%2!=0){
        moves++;
        sum = sum+moves;
        
       } 
       return moves;
    }
}
