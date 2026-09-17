class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totRow = matrix.length;
        int totCol = matrix[0].length;
        int n = totRow*totCol;
        int s = 0;
        int e = n-1;
        while(s<=e){
            int m = s+(e-s)/2;
            int rowIndex = m/totCol;
            int colIndex = m%totCol;
            if(matrix[rowIndex][colIndex]==target){
                return true;
            } else if(matrix[rowIndex][colIndex]>target){
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        return false;
    }
}
