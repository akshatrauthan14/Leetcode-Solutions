class Solution {
    public int minMoves(int[] nums) {
        // find min element, calc diff btw each element and add the diff
        int min = Integer.MAX_VALUE;
        for(int x:nums){
            if(x<min){
                min = x;
            }
        }
        int moves = 0;
        for(int x:nums){
            moves += x-min;
        }
        return moves;
    }
}
