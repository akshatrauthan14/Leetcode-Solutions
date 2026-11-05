class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        //sort the arr
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        //use 2 pointers to check -> for each element in arr1, check arr2 in [num-d,num+d]
        //if no element is in the range, increment ans
        int j = 0;
        int ans = 0;
        for(int x: arr1){
            //move j while arr2[j]<num-d
            while(j<arr2.length && arr2[j] < x-d){
                j++;
            }
            // num is valid if j reaches end or arr2[j]>num+d
            if(j == arr2.length || arr2[j] > x+d){
                ans++;
            }
        }
        return ans;
    }
}
//app2
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;

        for(int i = 0; i < arr1.length; i++) {
            boolean valid = true;

            for(int j = 0; j < arr2.length; j++) {
                if(Math.abs(arr1[i] - arr2[j]) <= d) {
                    valid = false;
                    break;
                }
            }

            if(valid) {
                count++;
            }
        }

        return count;
    }
}
