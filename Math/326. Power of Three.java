class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        return 1162261467%n == 0; //3^19 is max power of 3 u can store in int
        
    }
}
//app2
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        while(n%3==0){
            n=n/3;
        }
        return n==1;
    }
}
