public class Q69_square_root_of_a_no {
    public static void main(String[] args) {
        System.out.println(sqrt(2));
    }
    public int mySqrt(int n){
        int s = 0;
        int e =  n;
       
        if(n<2){
            return n;
        }
        while (s<=e) {
            int m = s+(e-s)/2;
            long sq = (long)m*m; // imp to typecast
            if (sq == n){
                return m;
            }
            if (sq>n) {
                e = m-1;
            }
            else{
                s= m+1;
            }
        }
        
        return s-1;
    }
