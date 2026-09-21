class Solution {
    public int reverse(int x) {
        int ans = 0;
        int temp = x;
        if(x<0){
            x = (-1)*x;
        }
        
        while(x>0){
            int rem = x%10;
            if(ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }
            ans=ans*10+rem;
            x=x/10;
        }
        if(temp<0){
            ans = (-1)*ans;
        }
        return ans;
    }
}
