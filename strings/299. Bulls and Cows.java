class Solution {
    public String getHint(String secret, String guess) {
        //count bulls right away
        // maintain arr for cows that store cnt of appeareacne of no in both strs
        int bulls = 0;
        int cows = 0;
        int[] nums = new int [10];
        for(int i = 0; i<secret.length(); i++){
            int s = secret.charAt(i) - '0';
            int g = guess.charAt(i) - '0';
            if(s==g){
                bulls++;
            } else{
                //curr digit in secret is alr in guess (as we increment it afterwards)
                if(nums[s]<0){
                    cows++;
                }
                //curr digit in guess is alr in secret (as we decrement it afterwards)
                if(nums[g]>0){
                    cows++;
                }
                nums[s]++;
                nums[g]--;
            }
        }
        return bulls + "A" + cows + "B";
    }
}
