class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int i = 0; i<prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            else{
                //price - minprice and maxProfit 
                int curr = prices[i]-minPrice;
                if(maxProfit < curr){
                    maxProfit = curr;
                }
            }
        }
        return maxProfit;
    }
}
