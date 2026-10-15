class Solution {
    public int[] plusOne(int[] digits) {
        //add normally, if last digit + 1 == 10 then make a new array of size digits.lenght+1 and put its first elemnt as 1
        for(int i = digits.length-1; i>=0; i--){
            if(digits[i] + 1 != 10){
                //add normally
                digits[i] +=1;
                return digits;
            }
            //if sum is 10 then make curr digit = 0, the next digit gets incremented in the next run of the loop
            digits[i] = 0;
        }
        //if the list ends in a 9
        int[] ans = new int[digits.length+1];
        ans[0] = 1;
        return ans;
    }
}
