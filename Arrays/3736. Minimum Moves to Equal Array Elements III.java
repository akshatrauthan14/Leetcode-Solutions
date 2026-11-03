class Solution {
    public int minMoves(int[] nums) {
        //find max element, calc sum of all elements
        //target = len * max (sum of all elemnts in arr after increasing)
        //return target - curr sum
        int max = Integer.MIN_VALUE;
        int s = 0;
        //calc sum of arr
        for(int num:nums){
            s += num;
            max = Math.max(num,max);
        }
        return nums.length*max - s;
    }
}
