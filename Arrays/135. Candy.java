class Solution {
    public int candy(int[] ratings) {
       // use 2 passes - L-R and R-L 
       //initialize candies arrr
       int count = 0;
       int[] candies = new int[ratings.length];
       //every child has atleas one candy
       for(int i = 0; i<ratings.length; i++){
        candies[i] = 1;
       }
       //if rating of curr child > prev ,then add 1 to its candies
       for(int i = 1; i<ratings.length; i++){
        if(ratings[i] > ratings[i-1]){
            candies[i] = candies[i-1] + 1;
        }
       }
       //traverse from end to check right neighbours
       for(int i = ratings.length-1; i>0; i--){
        if(ratings[i-1] > ratings[i]){
            candies[i-1] = Math.max(candies[i]+1, candies[i-1]);
        }
        count += candies[i-1];
       }
       //as count sums only upto [0,n-2]
       return count + candies[ratings.length-1];
    }
}
