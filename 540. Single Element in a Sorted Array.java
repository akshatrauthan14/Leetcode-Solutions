class Solution {
    public int singleNonDuplicate(int[] arr) {
        int s = 0;
        int e = arr.length-1;
        while (s<e) { 
            int m = s+(e-s)/2;
            if(m%2==1){
                m--;
            }
            if (arr[m] == arr[m+1]) {
                s=m+2;
            }   
            
            else{
                e=m;
            }
        }
        return arr[s];
    
    }
}
