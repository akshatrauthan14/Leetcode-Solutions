class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int startingRow = 0;
        int startingCol = 0;
        int endingCol = matrix[0].length-1;
        int endingRow = matrix.length-1;
        while(startingRow <= endingRow && startingCol <= endingCol){
            for(int i = startingCol; i<= endingCol; i++){
                ans.add(matrix[startingRow][i]);
            }
            startingRow++;
            for(int j = startingRow; j<= endingRow; j++){
                ans.add(matrix[j][endingCol]);
            }
            endingCol--;
            if(startingRow<=endingRow){
                for(int k = endingCol; k>=startingCol; k--){
                    ans.add(matrix[endingRow][k]);
                }
                endingRow--;
            }
            if(startingCol<=endingCol){
                for(int l = endingRow; l>=startingRow; l--){
                    ans.add(matrix[l][startingCol]);
                }
                startingCol++;
            }
        }
        return ans;
    }
}
