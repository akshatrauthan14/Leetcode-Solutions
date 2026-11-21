class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        //for every num from 1 to n, 
        //1st digit = 9 options
        //2nd digit = 9 options
        //3rd digit = 8 options and so on
        //multiply possibilities in each step
        if(n==0){
            return 1;
        }
        int res = 10;
        int uniqueDigits = 9;
        int availableNo = 9;
        while(n-- > 1 && availableNo >0){
            uniqueDigits = uniqueDigits * availableNo;
            res += uniqueDigits;
            availableNo--;
        }
        return res;
    }
}
