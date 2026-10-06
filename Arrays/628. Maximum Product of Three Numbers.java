class Solution {
    public int maximumProduct(int[] arr) {
        //sort and take product 
        Arrays.sort(arr);
        int n = arr.length;
        return Math.max((arr[n-1]*arr[n-2]*arr[n-3]),(arr[0]*arr[1]*arr[n-1]));
    }
}
//app 2
class Solution {
    public int maximumProduct(int[] arr) {
        //app1: sort and take product 
        // app2:take 
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int num: arr){
            if(num>max1){
                max3=max2;
                max2=max1;
                max1=num;
            }
            else if(num>max2){
                max3=max2;
                max2=num;
            }
            else if(num>max3){
                max3=num;
            }
            if(num<min1){
                min2=min1;
                min1=num;
            }
            else if(num<min2){
                min2=num;
            }
        }
        return Math.max(max1*max2*max3,min1*min2*max1);
    }
}
