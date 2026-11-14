class Solution {
    public String intToRoman(int num) {
        //map the values
        final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final String[] symbols = {"M", "CM", "D",  "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        //make stringbuilder for ans
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < values.length; ++i){
            if(num == 0){
                break;
            }
            while( num >= values[i]){
                sb.append(symbols[i]);
                num -= values[i];
            }
        }
        return sb.toString();
    }
}
// app2
class Solution {
    public String intToRoman(int num) {
        //map the values for every thousand digits
        //as num is less than 4000 always then we can use only 3 digits for thousandth place
        String[] M = {"","M","MM","MMM"};
        String[] C = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
    }
}
