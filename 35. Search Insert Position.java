class Solution {
    public int searchInsert(int[] arr, int target) {
        int s = 0;
        int e = arr.length-1;
        while (s<=e) {
            int m = s+(e-s)/2;
            if (target == arr[m]) {
                return m;
            }
            if (target>arr[m]) {
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return e+1;
    }
}
