class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        //store max height from both ends
        int left_max = height[left];
        int right_max = height[right];
        int water = 0;
        while(left<right){
            //check for which side to move
            if(left_max<right_max){
                //move left
                left++;
                left_max = Math.max(left_max, height[left]);
                water += left_max-height[left];
            } else{
                //move right
                right--;
                right_max = Math.max(right_max, height[right]);
                water += right_max - height[right];
            }
        }
        return water;
    }
}
