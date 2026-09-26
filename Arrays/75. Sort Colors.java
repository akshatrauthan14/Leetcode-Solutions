class Solution {
    public void sortColors(int[] nums) {
        // app 1 - normal sorting
        //app 2 - counting
        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
        for(int i: nums){
            if(i == 0){
                c0++;
            } else if ( i == 1){
                c1++;
            } else{
                c2++;
            }
        }
        // rewrite the array
        int i = 0;
        while(c0>0){
            nums[i] = 0;
            i++;
            c0--;
        }
        while(c1>0){
            nums[i] = 1;
            i++;
            c1--;
        }
        while(c2>0){
            nums[i] = 2;
            i++;
            c2--;
        }
    }
}
