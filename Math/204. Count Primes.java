class Solution {
    public int countPrimes(int n) {
        //seive of erast...
        // assume all no are prime. start from 2 and mark all its multiple as non prime
        //move to next prime and repeat this till root(n)
        if(n<=1){
            return 0;
        }
        int cnt = 0;
        boolean[] prime = new boolean[n];
        Arrays.fill(prime, true);
        //traverse till root(n)
        for(int i = 2; i*i < n; i++){
            if(prime[i] == true){
                //multiple of i can't be prime then
                for(int j = i*i; j<n; j+=i){
                    prime[j] = false;
                }
            }
        }
        //count call rem primes
        for(int i = 2; i<n; i++){
            if(prime[i]){
                cnt++;
            }
        }
        return cnt;
    }
}
