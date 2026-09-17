class Solution {
    static boolean isValidAns(int[] arr, int k, int maxPages){
        int student = 1;
        int pages = 0;
        for(int i =0; i<arr.length;i++){
            if(pages+arr[i]<=maxPages){
                //assign current as not out of limit
                pages+=arr[i];
            }
            else{
                //cannot be assigned
                student++;
                if(student>k || arr[i]>maxPages){
                    return false;
                }
                else{
                    pages=0;
                    pages+=arr[i];
                }
            }
        }
        return true;
    }
    public int splitArray(int[] arr, int k) {
        if(arr.length<k){
            return -1;
        }
        int s = 0;
        int e = arr.length;
        int sum = 0;
        for(int i=0;i<e;i++){
            sum+=arr[i];
        }
        e = sum;
        int ans = -1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(isValidAns(arr,k,m)){
                ans = m;
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        return ans;
    }
}
