class Solution {
    public int getSum(int a, int b) {
       // for nos without carry, it works fine with xor
       //for carry, calc carry a&b and left shift by 1 to take carry to next digit
       //give carry to one no and xor the other no to store the ans
       while(b!=0){
        int carry =  (a&b)<<1;
        a = a^b;
        b = carry;
       }
       return a; 
    }
}
