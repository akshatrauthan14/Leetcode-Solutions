class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        //use the gcd prop
        if(x+y<target){
            return false;
        }
        if(x==target || y==target || x+y==target){
            return true;
        }
        //get gcd and use trick
        return target%gcd(x,y) == 0; 
    }
    public int gcd(int a, int b){
    while(b != 0 ){
        int temp = b;
        b = a%b;
        a = temp;
    }
    return a;
}
}
