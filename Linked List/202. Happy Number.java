class Solution {
    public int sq(int n){
        int ans = 0;
        while(n>0){
            int rem = n%10;
            ans += rem*rem;
            n /= 10;
        }
        return ans;
    }
    public boolean isHappy(int n) {
        //when squaring, we see that we can find a cycle so we can use cycle in ll concept
        int slow = n;
        int fast = n;
        //initailly as fast and slow are at n, we have to use do while loop instead of while
        do{
            slow = sq(slow);
            fast = sq(sq(fast));
        } while(slow != fast);
        return slow == 1;
    }
}
