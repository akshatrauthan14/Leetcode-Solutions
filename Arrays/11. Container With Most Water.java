class Solution {
    public int maxArea(int[] height) {
        int s = 0;
        int e = height.length-1;
        int max = 0;
        while(s<e){
            //compute the min of leftside or righstsie area of graph 
            int currArea = (e-s)*Math.min(height[s], height[e]);
            max = Math.max(max, currArea);
            //shift the pointers
            if(height[s]<height[e]){
                s++;
            } else{
                e--;
            }
        }
        return max;
    }
}
