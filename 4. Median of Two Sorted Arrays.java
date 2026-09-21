class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length+nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                arr[k]=nums1[i];
                i++;
            }
            else{
                arr[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<nums1.length){
            arr[k] = nums1[i];
            k++;
            i++;
        }   
        while(j<nums2.length){
            arr[k] = nums2[j];
            k++;
            j++;
        }
        //array has been merged
        System.out.println(Arrays.toString(arr));
        int s= 0;
        int e = arr.length-1;
        double ans ;
        if(arr.length%2==0){
            int m = s+(e-s)/2;
            ans = (arr[m]+arr[m+1])/2.0;
        }
        else{
            int m = s+(e-s)/2;
            ans =arr[m];
        }
        return ans;
    }
}
