class Solution {
    public int[] sortArrayByParity(int[] arr) {
        // 2 pointers
        int i =0;
        int j = arr.length-1;
        while(i<j){
            if(arr[i]%2 != 0 && arr[j]%2==0){
                //swap elements
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else{
                if(arr[i]%2 == 0){
                    i++;
                }
                if(arr[j]%2 != 0){
                    j--;
                }
            }
        }
        return arr;
    }
}
